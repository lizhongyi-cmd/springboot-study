package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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

//    @Value("${name}")
//    private String name;
//
//    @Value("${person.age}")
//    private int age;
//
//    @Value("${address[2]}")
//    private String city;
//
//    @RequestMapping("/getName")
//    public String getName(){
//        System.out.println(name);
//        return name;
//    }

    @Autowired
    private Environment env;

    @Autowired
    private person person;


//    @RequestMapping("/getCity")
//    public String getCity(){
////        System.out.println(city);
//
//        System.out.println("----------------------------");
//        System.out.println(env.getProperty("address[2]"));
//
//        System.out.println("11111111111111111111111111111");
//
//        System.out.println(person);
//        return city;
//    }

//    @RequestMapping("/getAge")
//    public int getAge(){
//        System.out.println(age);
//        return age;
//    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }
}
