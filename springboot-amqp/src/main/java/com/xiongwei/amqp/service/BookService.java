package com.xiongwei.amqp.service;

import com.xiongwei.amqp.entity.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Author: 熊伟
 * @Date: 2019/4/10 21:54
 * @why：
 */
@Service
public class BookService {

    /**
     * 监听消息队列有消息过来，需要在启动类开启springboot注解支持
     * @param book
     */
    @RabbitListener(queues = "atguigu")
    public void receive(Book book){
        System.out.println("收到消息："+book);
    }

    /**
     * 监听还可以取到消息头信息
     * @param message
     */
    @RabbitListener(queues = "atguigu_user")
    public void receive2(Message message){
        System.out.println("收到消息："+message.getBody());
        System.out.println("收到消息："+message.getMessageProperties());
        System.out.println("收到消息："+message.getClass());
    }


}
