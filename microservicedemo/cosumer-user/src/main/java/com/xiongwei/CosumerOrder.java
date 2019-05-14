package com.xiongwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 熊伟
 * @Date: 2019/5/6 14:25
 * @why：
 */
@SpringBootApplication
public class CosumerOrder {
    public static void main(String[] args){
        SpringApplication.run(CosumerOrder.class);
    }

    @Bean
    public RestTemplate restTemplatet(){
        return  new RestTemplate();
    }
}
