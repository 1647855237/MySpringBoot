package com.xiongwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务的注册
 * 1.配置eureka配置文件
 * 2.开启EnableEurekaServer注解
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8761Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8761Application.class, args);
    }

}
