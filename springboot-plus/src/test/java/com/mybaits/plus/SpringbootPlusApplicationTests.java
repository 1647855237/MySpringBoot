package com.mybaits.plus;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
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

    @Test
    public void insert() {
        User user = new User();
        user.setAge(22);
        user.setEmail("1647855237Wqq.om");
        user.setName("xiongwei");
        userMapper.insert(user);
    }

    @Test
    public void delete() {
        int i = userMapper.deleteById(6);
        System.out.println(i);
    }

    @Test
    public void update() {
        User user = new User();
        user.setName("xiongwei2");
        user.setId(7);
        userMapper.updateById(user);
    }

    @Test
    public void find() {
        /**
         *  插入排序
         */
        int[] num = {200, 52, 12, 43, 81, 23};
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];//当前比的值 52
            int j = 0;//200
            for (j = i - 1; j >= 0; j--) {
                if (temp > num[j]) {
                    break;
                } else {
                    num[j + 1] = num[j];
                }
            }
            if (num[j + 1] != temp) {
                num[j + 1] = temp;
            }
        }
        for (int k = 0; k < num.length; k++) {
            System.out.println(num[k]);
        }

    }


    /**
     * 二分查询
     */
    @Test
    public void binaySearch() {

        int[] num = {20, 30, 40, 50, 60, 70, 80};
        int binay = this.binay(num, 60);
        System.out.println(binay);
    }


    public int binay(int[] num, int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {//0  5
            int middet = (start + end) / 2;//3
            if (num[middet] > key) {
                end = middet - 1;
            } else if (num[middet] < key) {//end=
                start = middet + 1;
            } else {
                return middet;
            }
        }
        return -1;
    }


}
