package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/helloWorld")
    public String index(){
        return "hell spring boot";
    }
    @RequestMapping("/getUser")
    public person getUser() {
        person user = new person();
        user.setAge(12);
        user.setName("张三");
        return user;
    }

}
