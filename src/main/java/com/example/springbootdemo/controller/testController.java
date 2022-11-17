package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {
//    @RequestMapping("/test")
//    public String test1(){
//        return "test";
//    }

//    @RequestMapping("/test2")
//    public String test2(Model model) {
//
//        model.addAttribute("msg", "标准变量表达式");
//
//        UserBean blog=new UserBean();
//        blog.setId(1);
//        blog.setName("yixin");
//        blog.setPassward("123");
//
//        model.addAttribute("blog",blog);
//        return "test2";
//    }


//    @RequestMapping("/test3")
//    public String test2(Model model) {
//        model.addAttribute("msg", "标准变量表达式");
//
//        UserBean blog=new UserBean();
//        blog.setId(1);
//        blog.setName("yixin");
//        blog.setPassward("123");
//
//        model.addAttribute("blog",blog);
//        return "test3";
//    }
//
//    @RequestMapping("/blog")
//    @ResponseBody
//    public String getUserById(Integer id) {
//
//        System.out.println("id=" + id);
//        return "id=" + id;
//    }
//
//    @RequestMapping("/test4")
//    public String test2(Model model) {
//
//        model.addAttribute("msg", "标准变量表达式");
//        UserBean blog=new UserBean();
//        blog.setId(1);
//        blog.setName("yixin");
//        blog.setPassward("123");
//        model.addAttribute("blog",blog);
//
//        return "test4";
//    }
//
//    @RequestMapping("/blog")
//    @ResponseBody
//    public String getUserById(Integer id) {
//        System.out.println("id=" + id);
//        return "id=" + id;
//    }

//
//
//    @RequestMapping("/blogList")
//    public String hello(Model model) {
//        List<UserBean> blogList = new ArrayList<>();
//
//        for (int i = 1; i <= 3; i++) {
//            UserBean blog=new UserBean();
//            blog.setId(i);
//            blog.setPassward("abcd"+i);
//            blog.setName("一心"+i);
//            blogList.add(blog);
//        }
//
//        model.addAttribute("blogList", blogList);
//        return "test5";
//    }
@RequestMapping("/test6")
public String test2(Model model) {

    model.addAttribute("msg", "标准变量表达式");

    UserBean blog=new UserBean();
    blog.setId(1);
    blog.setName("yixin");
    blog.setPassward("123");

    model.addAttribute("blog",blog);
    return "test6";
}
}