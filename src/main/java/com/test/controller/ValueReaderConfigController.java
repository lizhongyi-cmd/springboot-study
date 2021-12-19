package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-19 16:20
 **/
@RestController
public class ValueReaderConfigController {
    @Value("${test.msg}")
    private String msg;

    @RequestMapping("/testValue")
    public String testValue(){
        return "方法二：" + msg;
    }
}
