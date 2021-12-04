package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springboot-study
 * @description: spring boot 项目的入口，引导类
 * @author: lizhongyi3
 * @create: 2021-12-04 15:25
 **/
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
