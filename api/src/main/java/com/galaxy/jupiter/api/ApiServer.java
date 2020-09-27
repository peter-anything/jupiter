package com.galaxy.jupiter.api;

import com.galaxy.jupiter.api.dao.UserMapper;
import com.galaxy.jupiter.api.entity.User;
import com.galaxy.jupiter.api.performance.util.DBRecordGeneratorUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class ApiServer {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ApiServer.class, args);
        LinkedBlockingQueue<User> userQ = new LinkedBlockingQueue(1 << 20);
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (long i = 0; i < (1 << 24); i++) {
                    User user = DBRecordGeneratorUtil.generateUser();
                    userQ.offer(user);
                }
            }
        };
        thread.start();
        AtomicInteger threadCount = new AtomicInteger();
        BlockingQueue<Runnable> threadQ = new LinkedBlockingQueue(1 << 20);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                4, 8,
                10, TimeUnit.SECONDS, threadQ,
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r, "DB_USER_GENERATOR_" + threadCount.getAndIncrement());
                    }
                },
                new ThreadPoolExecutor.AbortPolicy()
        );
        UserMapper userMapper = ctx.getBean(UserMapper.class);

        for (int i = 0; i < 8; i++) {
            threadPoolExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        User user = userQ.poll();
                        userMapper.insertSelective(user);
                    }

                }
            });
        }

    }
}
