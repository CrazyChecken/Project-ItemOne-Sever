package com.zhaoyu.web;

import org.hibernate.sql.Select;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasisController {
    @RequestMapping("/login")
    public String login() {

        return "这是登录页面";
    }
}
