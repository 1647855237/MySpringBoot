package com.xiongwei.springboot;

import com.xiongwei.springboot.entity.Book;
import com.xiongwei.springboot.entity.User;
import com.xiongwei.springboot.repository.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEalsticsearchApplicationTests {

    @Autowired
    private JestClient jestClient;

    @Test
    public void contextLoads() {
        //创建索引对象（保存对象）
        User user = new User();
        user.setId(1);
        user.setName("熊伟2");
        user.setGender("男男");
        user.setText("Hello World ElasticSearch");
        //创建索引
        Index index = new Index.Builder(user).index("xiongwei").type("hello").build();
        try {
            //执行
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试检查
     */
    @Test
    public void search(){

        String json = "{\n" +
                "    \"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"text\" : \"Hello\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        Search search = new Search.Builder(json).addIndex("xiongwei").addType("hello").build();

        try {
            SearchResult result = jestClient.execute(search);
            System.out.println("result.getJsonString() = " + result.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 上面是jest操作
     * 下面是ElasticSearch操作
     */
    @Autowired
    private BookRepository repository;

    @Test
    public void test2(){
        Book book = new Book();
        book.setId(3);
        book.setAuthor("熊伟");
        book.setName("java");
        repository.index(book);
    }



}
