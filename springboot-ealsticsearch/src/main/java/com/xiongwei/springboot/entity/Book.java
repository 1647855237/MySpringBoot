package com.xiongwei.springboot.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author: 熊伟
 * @Date: 2019/4/11 14:07
 * @why：
 */
@Data
@Document(indexName = "xiongwei",type = "hello")
public class Book {

    private Integer id;

    private String name;

    private String author;






}
