package com.mybaits.plus.controller;

import com.mybaits.plus.mapper.UserMapper;
import com.mybaits.plus.model.User;
import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 熊伟
 * @Date: 2019/4/22 8:39
 * @why：
 */
@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public Object hello() {
        List<User> users = userMapper.selectList(null);
        return users;


    }
}
