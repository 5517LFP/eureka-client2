package com.example.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class testrestTemplate {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String serverport;

    @RequestMapping("getother")
    public String testrestTemplate(){
        String url="http://eureka-client/getuser";
        String result=restTemplate.getForObject(url,String.class);

        return "test"+result+serverport;

    }
}
