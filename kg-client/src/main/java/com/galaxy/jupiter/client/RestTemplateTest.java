package com.galaxy.jupiter.client;

import com.alibaba.fastjson.JSONObject;
import com.galaxy.jupiter.client.request.KgLoginRequestBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        KgLoginRequestBean kgLoginRequestBean = new KgLoginRequestBean();
        kgLoginRequestBean.setUsername("admin");
        kgLoginRequestBean.setPassword("admin");
        HttpEntity<String> request = new HttpEntity<>(JSONObject.toJSONString(kgLoginRequestBean), headers);
        ResponseEntity<String> postForEntity = restTemplate.postForEntity("http://100.100.20.108:50000/auth/login/", request, String.class);
        System.out.println(postForEntity.getBody());
    }
}
