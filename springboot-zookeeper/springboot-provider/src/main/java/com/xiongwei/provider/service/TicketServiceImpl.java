package com.xiongwei.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Author: 熊伟
 * @Date: 2019/4/12 10:11
 * @why：
 */
@Component
@Service
public class TicketServiceImpl implements ITicketService {
    @Override
    public String getTicket() {
        return "<厉害了，我的国>";
    }
}
