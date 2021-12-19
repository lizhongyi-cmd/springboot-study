package com.test.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-19 17:12
 **/
@RestController
public class LogTestController {
    private Log log = LogFactory.getLog(LogTestController.class);
    @RequestMapping("/testLog")
    public String testLog(){
        log.info("这是一条测试日志！");
        return "测试日志";
    }
}
