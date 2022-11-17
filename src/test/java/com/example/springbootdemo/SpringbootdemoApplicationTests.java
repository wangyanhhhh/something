package com.example.springbootdemo;

import com.example.springbootdemo.bean.UserBean;
import com.example.springbootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public  class SpringbootdemoApplicationTests {
    @Resource
    UserService userService;
    @Test
   public void contextLoads(){
        UserBean userBean=userService.logIn("Mike","123");
        System.out.println("user ID is");
        System.out.println(userBean.getId());
    }

}
