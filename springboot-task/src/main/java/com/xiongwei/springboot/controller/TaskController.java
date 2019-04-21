package com.xiongwei.springboot.controller;

import com.xiongwei.springboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 熊伟
 * @Date: 2019/4/11 14:58
 * @why：
 */
@RestController
public class TaskController {

    @Autowired
    private TaskService service;


    @GetMapping("/hello")
    public String hello(){
        service.asyncTack();
        return "success";
    }







}
