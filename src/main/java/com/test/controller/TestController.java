package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-19 15:27
 **/
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "你好，springbot";
    }
}
