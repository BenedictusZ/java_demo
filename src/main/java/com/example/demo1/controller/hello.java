package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuzhengxing
 * @create 2022-09-07 8:30
 */
@RestController
public class hello {
    @RequestMapping("/hello")
    public String TestController() {
        String hi = "helloword Spring Boot！这是一个用Spring Boot开发的网站。";
        return hi;
    }
}
