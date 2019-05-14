package com.xiongwei.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 熊伟
 * @Date: 2019/5/6 14:03
 * @why：
 */
public class User implements Serializable {

    private Long id;

    private Date data;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return new Date();
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", data=" + data +
                '}';
    }
}
