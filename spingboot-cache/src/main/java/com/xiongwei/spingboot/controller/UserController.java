package com.xiongwei.spingboot.controller;

import com.xiongwei.spingboot.entity.User;
import com.xiongwei.spingboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 熊伟
 * @Date: 2019/4/10 15:12
 * @why：
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/user/{id}")
    public Object find(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }


    @RequestMapping("/update")
    public Object find(User user) {
        userService.update(user);
        return null;
    }

    @GetMapping("/delete")
    public String delete(@PathVariable("id") Integer id) {
        userService.delete(id);
        return "success";
    }


}
