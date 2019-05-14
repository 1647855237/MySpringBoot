package com.xiongwei.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 熊伟
 * @Date: 2019/5/11 10:06
 * @why：自定义负载均衡算法
 * 注意：这个类不能放在ComponentScan扫描下的包或者子包下，否则我们这个类会被所有
 *  的Ribbon客户端所共享，就达不到特殊化定制的目的了
 *
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //return new RandomRule();
        return new MySelfRuleTwo();
    }

}
