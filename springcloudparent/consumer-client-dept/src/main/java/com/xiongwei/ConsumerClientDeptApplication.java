package com.xiongwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
/**
 * Feign负载均衡
 *  他集成了Ribbon，默认还是轮询算法，是面向接口服务，只需要定义服务绑定接口并
 *      以申明式的方法调用服务接口
 *  1.导包，然后需要在启动类上加注解@EnableFeignClients，name可以指定扫描路径
 *
 */
public class ConsumerClientDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientDeptApplication.class, args);
    }

}
