package com.xiongwei.controller;

import com.xiongwei.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 熊伟
 * @Date: 2019/5/6 14:03
 * @why：
 */
@RestController
public class UserController {


    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return  new User(id);
    }


}
