package com.mybaits.plus;

import com.mybaits.plus.mapper.UserMapper;
import com.mybaits.plus.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootPlusApplicationTests {

    @Resource
    private UserMapper userMapper;


    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectList(null);

    }

}
