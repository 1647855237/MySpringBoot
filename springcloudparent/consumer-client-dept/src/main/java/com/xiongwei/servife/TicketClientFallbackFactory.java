package com.xiongwei.servife;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: 熊伟
 * @Date: 2019/5/11 23:13
 * @why：
 */
@Component
public class TicketClientFallbackFactory implements FallbackFactory<TicketService> {
    @Override
    public TicketService create(Throwable throwable) {
        return new TicketService() {
            @Override
            public String getTocket() {
                return null;
            }

            @Override
            public Object getId(Long id) {
                return "你访问的ID是--"+id+"，访问失败，服务降级";
            }
        };
    }
}
