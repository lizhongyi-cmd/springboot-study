package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-19 16:58
 **/
@RestController
//在此处设置使用哪个配置文件
//@PropertySource({"test.properties","ok.properties"})
public class PropertySourceValueReaderOtherController {
    @Value("${my.msg}")
    private String mymsg;
    @Value("${your.msg}")
    private String yourmsg;
    @RequestMapping("/testProperty")
    public String testProperty(){
        return mymsg + ":" +yourmsg;
    }

}
