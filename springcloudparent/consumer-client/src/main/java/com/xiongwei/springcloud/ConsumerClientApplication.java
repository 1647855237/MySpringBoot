package com.xiongwei.springcloud;

import com.xiongwei.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 客户端
 */
@SpringBootApplication
@EnableEurekaClient
/**
 * name是服务名，针对谁
 * configuration自定义算法的类
 */
@RibbonClient(name = "PRODUCTION-TIACK",configuration = MySelfRule.class)
public class ConsumerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class, args);
    }


    /**
     * 开启负载均衡机制
     * Ribbon有七种算法，默认是轮询算法
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 变换负载均衡的算法，IRule是七种算法的接口
     * RandomRule是随机算法，还可以变成其他算法那，看业务需求
     * @return
     */
//    @Bean
//    public IRule myRoue(){
//        return new RandomRule();
//    }


}
