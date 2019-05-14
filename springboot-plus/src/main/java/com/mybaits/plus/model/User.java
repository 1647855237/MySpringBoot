package com.mybaits.plus.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author: 熊伟
 * @Date: 2019/4/21 11:56
 * @why：
 */
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

    private String email;

}
