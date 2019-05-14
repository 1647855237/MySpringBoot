package com.xiongwei.servife;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 熊伟
 * @Date: 2019/5/11 20:31
 * @why：name是服务名，服务降级
 */
//@FeignClient(name = "PRODUCTION-TIACK")
@FeignClient(value ="PRODUCTION-TIACK",fallbackFactory = TicketClientFallbackFactory.class)
public interface TicketService {


    /**
     * 注意这里需要和提供服务的路径一样，不然会报错
     * @return
     */
    @RequestMapping("/dept/getTicket")
    String getTocket();

    @RequestMapping("/get/{id}")
    Object getId(@PathVariable Long id);
}
