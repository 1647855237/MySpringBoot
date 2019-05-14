package com.xiongwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulGateway9527Application.class, args);
    }

}
