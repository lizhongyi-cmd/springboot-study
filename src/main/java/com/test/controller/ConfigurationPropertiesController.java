package com.test.controller;

import com.test.model.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-19 16:35
 **/
@RestController
public class ConfigurationPropertiesController {
    @Autowired
    StudentProperties studentProperties;
    @RequestMapping("/testConfigurationProperties")
    public String testConfigurationProperties(){
        return studentProperties.toString();
    }
}
