package com.xiongwei.amqp.entity;

import lombok.Data;

/**
 * @Author: 熊伟
 * @Date: 2019/4/10 21:53
 * @why：
 */
@Data
public class Book {

    private Integer id;

    private String name;

    private String money;


    public Book() {
    }

    public Book(String name, String money) {
        this.name = name;
        this.money = money;
    }
}
