package com.galaxy.jupiter.api.performance.util;

import com.galaxy.jupiter.api.entity.User;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class DBRecordGeneratorUtil {
    private static final List<String> NAMES = FileUtil.getAllLinesFromResourceFile("names.txt");
    private static Random random = new Random();
    private static final char[] LETTERS = new char[]{
            'a',
            'b',
            'c',
            'd',
            'e',
            'f',
            'g',
            'h',
            'i',
            'j',
            'k',
            'l',
            'm',
            'n',
            'o',
            'p',
            'q',
            'r',
            's',
            't',
            'u',
            'v',
            'w',
            'x',
            'y',
            'z'
    };

    public static String generateUsername() {
        return NAMES.get(random.nextInt(NAMES.size()));
    }

    public static String generateWord() {
        StringBuilder stringBuilder = new StringBuilder();
        int len = random.nextInt(10) + 6;
        for (int i = 0; i < len; i++) {
            stringBuilder.append(LETTERS[random.nextInt(LETTERS.length)]);
        }

        return stringBuilder.toString();
    }

    public static String generateStr() {
        StringBuilder stringBuilder = new StringBuilder();
        int len = random.nextInt(10) + 6;
        for (int i = 0; i < len; i++) {
            stringBuilder.append(LETTERS[random.nextInt(LETTERS.length)]);
        }

        return stringBuilder.toString() + generatePhone();
    }

    public static String generateEmail() {
        return generateWord() + "@163.com";
    }

    public static String generatePhone() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    public static String generatePassword() {
        return CryptoUtil.getSaltMd5AndSha(generateStr());
    }

    public static Integer generateTimeStamp() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static Long generateIp() {
        return 3232235776L + random.nextInt(254);
    }

    public static String longToIP(long longIp) {
        StringBuffer sb = new StringBuffer("");
        // 直接右移24位
        sb.append(String.valueOf((longIp >>> 24)));
        sb.append(".");
        // 将高8位置0，然后右移16位
        sb.append(String.valueOf((longIp & 0x00FFFFFF) >>> 16));
        sb.append(".");
        // 将高16位置0，然后右移8位
        sb.append(String.valueOf((longIp & 0x0000FFFF) >>> 8));
        sb.append(".");
        // 将高24位置0
        sb.append(String.valueOf((longIp & 0x000000FF)));
        return sb.toString();
    }

    public static long ipToLong(String strIp) {
        String[]ip = strIp.split("\\.");
        return (Long.parseLong(ip[0]) << 24) + (Long.parseLong(ip[1]) << 16) + (Long.parseLong(ip[2]) << 8) + Long.parseLong(ip[3]);
    }

    public static User generateUser() {
        User user = new User();
        user.setName(generateUsername());
        user.setNickname(generateEmail());
        user.setEmailAddress(generateEmail());
        user.setPhone(Long.valueOf(generatePhone()));
        user.setPassword(generatePassword());
        user.setRegisterIp(generateIp());
        user.setLastLoginIp(generateIp());
        user.setUpdatedTime(new Date());
        return user;
    }
}
