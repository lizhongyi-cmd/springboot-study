package com.itheima;

import com.itheima.controller.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-05 15:40
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class UserServicetest {

    @Autowired
    private UserService userService;
    @Test
    public void testadd(){
        userService.add();
    }

}
