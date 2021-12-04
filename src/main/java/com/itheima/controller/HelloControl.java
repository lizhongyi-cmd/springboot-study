package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-04 15:21
 **/
@RestController
@RequestMapping
public class HelloControl {
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }
}
