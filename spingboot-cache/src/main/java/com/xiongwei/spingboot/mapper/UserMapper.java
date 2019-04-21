package com.xiongwei.spingboot.mapper;

import com.xiongwei.spingboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: 熊伟
 * @Date: 2019/4/10 14:55
 * @why：
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> findAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(Integer id);

    @Select("UPDATE user SET name=#{name},gender=#{gender},sallay=#{sallay} WHERE id=#{id}")
    void update(User user);


}
