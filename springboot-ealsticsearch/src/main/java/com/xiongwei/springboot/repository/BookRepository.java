package com.xiongwei.springboot.repository;

import com.xiongwei.springboot.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: 熊伟
 * @Date: 2019/4/11 14:06
 * @why：
 */
public interface BookRepository extends ElasticsearchRepository<Book, Integer> {


}
