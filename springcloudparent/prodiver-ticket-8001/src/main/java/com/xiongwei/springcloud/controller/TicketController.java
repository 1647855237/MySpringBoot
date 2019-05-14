package com.xiongwei.springcloud.controller;

import com.xiongwei.service.TocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 熊伟
 * @Date: 2019/5/5 17:34
 * @why：
 */
@RestController
public class TicketController {

    @Autowired
    private TocketService tocketService;
    /**
     * 服务的发现
     */
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/getTicket")
    public String getTicket() {
        return tocketService.getTocket();
    }


//    @RequestMapping("/ticket/discovery")
//    public Object discovery() {
//        List<String> services = client.getServices();
//        System.out.println("-----------------" + services);
//        int order = client.getOrder();
//        System.out.println("-----------------" + order);
//        List<ServiceInstance> list = client.getInstances("PRODUCTION-TIACK");
//        for (ServiceInstance instance : list) {
//            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort()
//                    + "\t" + instance.getScheme() + instance.getUri() + instance.getServiceId());
//        }
//        return this.client;
//
//    }


}
