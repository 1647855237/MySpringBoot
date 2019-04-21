package com.xiongwei.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: 熊伟
 * @Date: 2019/4/9 16:37
 * @why：
 */
public class ServletInitalizer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootWebWarApplication.class);
    }
}
