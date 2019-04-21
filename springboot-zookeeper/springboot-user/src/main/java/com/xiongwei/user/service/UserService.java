package com.xiongwei.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiongwei.provider.service.ITicketService;
import org.springframework.stereotype.Service;

/**
 * @Author: 熊伟
 * @Date: 2019/4/12 10:45
 * @why：
 */
@Service
public class UserService {

    /**
     * 这里时根据全类名进行匹配的。。
     */
    @Reference(lazy = true)
    private ITicketService ticketService;
    
    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println(ticket);

    }
}
