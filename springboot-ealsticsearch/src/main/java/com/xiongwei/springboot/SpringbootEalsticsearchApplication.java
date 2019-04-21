package com.xiongwei.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  springboot整合elasticsearch
 *  有两种操作方法：
 *      1.jest（默认不支持的）需要导包
 *      2.elasticsearch（默认的）
 *          starter-data-elasticsearch[版本可能不合适。就会启动报错]
 *          版本匹配：https://github.com/spring-projects/spring-data-elasticsearch
 *
 *
 */

@SpringBootApplication
public class SpringbootEalsticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEalsticsearchApplication.class, args);
    }

}
