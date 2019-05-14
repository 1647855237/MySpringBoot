package com.xiongwei.controller;

import com.xiongwei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 熊伟
 * @Date: 2019/5/6 14:26
 * @why：
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    public static final String url = "http://localhost:8081/user/";

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        User user = restTemplate.getForObject(url+id, User.class);
        return user;
    }


}
