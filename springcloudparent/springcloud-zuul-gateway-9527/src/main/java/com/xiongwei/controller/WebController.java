package com.xiongwei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 熊伟
 * @Date: 2019/5/13 21:23
 * @why：
 */
@RestController
public class WebController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

}
