package com.xiongwei.spingboot.service;

import com.xiongwei.spingboot.entity.User;
import com.xiongwei.spingboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 熊伟
 * @Date: 2019/4/10 14:55
 * @why：
 * @CacheConfig:这个注解写在类上，下面所有的方法都不用指定缓存名了
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    /**
     * 缓存必须指定缓存名字
     * value：缓存名
     * key:生成key值，用于缓存key，
     * key生成策略：
     * 如果不指定，默认是方法的参数
     * 如果有多个，也就是多个一起生成的key
     * condition：指定条件生成缓存
     * unless：除非条件成立，才不缓存数据
     * sync:开启异步缓存；默认false
     *
     * @param id
     * @return
     */
    @Cacheable(value = "user"/*,key = "#id",unless = "#id==1"*/)
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    /**
     * @param user
     * @CachePut:这个方法同步缓存需要指定跟查询的key值一样，因为底层是一个键值对HahshMap， 更新之后的key缓存和查询的不一样所以，查询出来的数据没有更新，其实更新了
     */
    @CachePut(value = "user", key = "#user.id")
    public void update(User user) {
        userMapper.update(user);
    }


    /**
     * @param id
     * @CacheEvict:清除缓存 allEntries = true:删除这个key的所有缓存
     * beforeInvocation = true：在方法执行之前清楚缓存，默认在方法执行之后
     * 比如执行过程中出错了，就无法清除缓存了
     */
    @CacheEvict(value = "user")
    public void delete(Integer id) {
        System.out.println("删除的" + id);
    }

    /**
     * @Caching:定义复杂的缓存条件
     */
    @Caching(
            cacheable = {
            },
            put = {
            },
            evict = {
            }
    )
    public void get() {

    }

}
