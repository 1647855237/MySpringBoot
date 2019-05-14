package com.xiongwei.amqp.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 熊伟
 * @Date: 2019/4/10 21:23
 * @why：
 */
@Configuration
public class MyAMQP {


    /**
     * 自定义序列化器，原本的Sim的数据不好看，可以用这个转换成json的格式
     *
     * @return
     */
    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}
