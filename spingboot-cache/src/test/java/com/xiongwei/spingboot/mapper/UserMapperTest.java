package com.xiongwei.spingboot.mapper;

import com.xiongwei.spingboot.entity.User;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Author: 熊伟
 * @Date: 2019/4/10 15:02
 * @why：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper user;

    @Test
    public void find() {
        List<User> all = user.findAll();
        System.out.println(all);


    }


}