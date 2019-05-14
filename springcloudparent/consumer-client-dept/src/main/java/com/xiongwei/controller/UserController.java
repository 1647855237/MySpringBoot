package com.xiongwei.controller;

import com.xiongwei.servife.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: 熊伟
 * @Date: 2019/5/5 17:51
 * @why：
 */
@RestController
public class UserController {

    @Autowired
    private TicketService service;


    @RequestMapping("/consumer/get")
    public String get() {
        return this.service.getTocket();
    }

    @RequestMapping("/consumer/get/{id}")

    public Object getId(@PathVariable Long id) {
//        if (id == 2 || id == 3) {
//            throw new RuntimeException("异常");
//        }
        return this.service.getId(id);
    }
}
