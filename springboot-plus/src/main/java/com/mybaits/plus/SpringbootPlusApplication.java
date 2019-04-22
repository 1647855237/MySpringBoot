package com.mybaits.plus;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybaits.plus.mapper")
public class SpringbootPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPlusApplication.class, args);

    }

}
