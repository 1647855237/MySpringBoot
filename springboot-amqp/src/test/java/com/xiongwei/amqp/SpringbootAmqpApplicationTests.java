package com.xiongwei.amqp;

import com.xiongwei.amqp.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootAmqpApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 创建或删除和绑定queue、exchange、bind
     * 的组件，是在RabbitTemplate类中注册的
     */
    @Autowired
    private AmqpAdmin amqpAdmin;

    @Test
    public void setAmqpAdmin() {
        /**
         * 这里需要注意交换机和队列名别写错了
         */
        amqpAdmin.declareQueue(new Queue("admin.queue"));
        amqpAdmin.declareExchange(new DirectExchange("admin.exchange"));
        amqpAdmin.declareBinding(new Binding("admin.queue", Binding.DestinationType.QUEUE,
                "admin.exchange", "admin.amqp", null));
    }


    @Test
    public void contextLoads() {
        Map<String, String> map = new HashMap<>(16);
        map.put("xiongwei", "熊伟");
        map.put("xionglin", "熊林");
        rabbitTemplate.convertAndSend("exchange_direct", "atguigu_user", new Book("三国演义", "罗贯中"));
        System.out.println("已发送");
    }

    @Test
    public void receive() {
        Object atguigu = rabbitTemplate.receiveAndConvert("atguigu_user");
        System.out.println(atguigu.getClass());
        System.out.println(atguigu);
    }

}
