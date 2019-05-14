package com.xiongwei.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 熊伟
 * @Date: 2019/4/9 16:32
 * @why：
 */
@Controller
public class JspController {

    @RequestMapping("/hello")
    public String hello() {
        return "index";
    }
}
