package com.xiongwei.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 分三步可以首页dubbo和zookeeper
 * 1.导入dubbo和zkclient的包
 */
@SpringBootApplication
public class SpringbootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProviderApplication.class, args);
    }

}
