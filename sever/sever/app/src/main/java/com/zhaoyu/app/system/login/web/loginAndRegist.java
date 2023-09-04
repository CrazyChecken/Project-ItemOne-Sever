package com.zhaoyu.app.system.login.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginAndRegist {
    @RequestMapping(value = "/add")
    public String login() {
        System.out.println("这是登录页面");
        return "这是登录页面";
    }

}
