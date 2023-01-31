package com.athl.gulimall.product.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping
    public void test(){
        // 测试
        System.out.println("panhai提交");
    }
}
