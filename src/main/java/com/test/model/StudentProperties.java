package com.test.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-19 16:33
 **/

@Component
@ConfigurationProperties(prefix = "obj")
public class StudentProperties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
