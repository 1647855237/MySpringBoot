package com.xiongwei.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Author: 熊伟
 * @Date: 2019/4/11 14:57
 * @why：
 */
@Service
public class TaskService {

    /**
     * 标记方法是异步的。。。可以使方法异步执行
     */
    @Async
    public void asyncTack() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");
    }


    /**
     * @Scheduled：定时任务注解： cron：second（秒）,minute（分）,hour（时）,day of month（日）,month(月) ,day of week（周几）.
     * @Scheduled(cron = "0 * * * * MON-FRI")
     * @Scheduled(cron = "0,1,2,3.4 * * * * MON-FRI")
     * @Scheduled(cron = "0-4 * * * * MON-FRI")
     */
    @Scheduled(cron = "0-4 * * * * MON-FRI")
    public void scheduled() {
        System.out.println("Hello World...");
    }


}
