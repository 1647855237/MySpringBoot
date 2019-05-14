package com.xiongwei.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Author: 熊伟
 * @Date: 2019/5/5 17:51
 * @why：
 */
@RestController
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    public static final String URL = "http://PRODUCTION-TIACK";

    @GetMapping("/abc")
    public String get() {
        String forObject = restTemplate.getForObject(URL + "/getTicket", String.class);
        return forObject;
    }

    /**
     * 服务发现
     *
     * @return
     */
    @GetMapping("/consumer/discovery")
    public Object discovery() {
        return restTemplate.getForObject(URL + "/ticket/discovery", Object.class);
    }

}
