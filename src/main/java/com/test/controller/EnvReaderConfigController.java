package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-19 16:07
 **/
@RestController
public class EnvReaderConfigController {
    @Autowired
    private Environment env;

    @RequestMapping("/testEnv")
    public String testEnv(){
        return "方法一：" + env.getProperty("test.msg");
    }
}
