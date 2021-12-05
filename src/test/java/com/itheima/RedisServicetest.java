package com.itheima;

import com.itheima.controller.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-05 15:40
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class RedisServicetest {

    @Autowired
    private RedisTemplate redisTemplate; //默认使用连接的是本机的redis
    @Test
    public void testSet(){
        //存入数据
        redisTemplate.boundValueOps("name").set("zhangSan");
    }

    @Test
    public void testGet(){
        //获取数据
         Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }

}
