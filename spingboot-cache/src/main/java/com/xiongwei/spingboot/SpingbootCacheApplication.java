package com.xiongwei.spingboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @schema注解不能为空，springboot自动运行
 * @EnableCaching：开启缓存
 *
 */
@EnableCaching
@SpringBootApplication
@MapperScan("com.xiongwei.spingboot.mapper")
public class SpingbootCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingbootCacheApplication.class, args);
    }

}
