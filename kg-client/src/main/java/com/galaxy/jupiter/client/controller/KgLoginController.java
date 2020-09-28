package com.galaxy.jupiter.client.controller;

import com.alibaba.fastjson.JSONObject;
import com.galaxy.jupiter.client.common.ResponseBean;
import com.galaxy.jupiter.client.request.KgLoginRequestBean;
import com.galaxy.jupiter.client.response.KgLoginResponseBean;
import com.galaxy.jupiter.client.util.HttpUtil;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

import java.util.List;

import static com.galaxy.jupiter.client.common.Config.ResponseCodeAndMsg.SUCCESS_CODE;
import static com.galaxy.jupiter.client.common.Config.ResponseCodeAndMsg.SUCCESS_MSG;

@RestController
@RequestMapping("/user")
public class KgLoginController {
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/login")
    public ResponseBean<KgLoginResponseBean> login(@RequestBody KgLoginRequestBean kgLoginRequestBean) {
        List<String> serviceNames = discoveryClient.getServices();
        String kgApiServiceURI = null;
        for (String serviceName : serviceNames) {
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceName);
            for (ServiceInstance serviceInstance : serviceInstances) {
                if (("kg-api-service").equals(serviceName)) {
                    kgApiServiceURI = serviceInstance.getUri().toString();
                }
                System.out.println(String.format("%s:%s", serviceName, serviceInstance.getUri()));
            }
        }

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(JSONObject.toJSONString(kgLoginRequestBean), headers);
        ResponseEntity<String> postForEntity = restTemplate.postForEntity(kgApiServiceURI + "/auth/login/", request, String.class);
        System.out.println(postForEntity.getBody());

        return new ResponseBean<>(SUCCESS_CODE, SUCCESS_MSG, null);
    }
}
