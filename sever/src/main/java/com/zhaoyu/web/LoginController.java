package com.zhaoyu.web;

import com.zhaoyu.basis.Result;
import com.zhaoyu.domain.User;
import com.zhaoyu.entity.request.LoginRequest;
import com.zhaoyu.sever.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public Result login(
            @RequestBody LoginRequest loginEntity) {
        User user =  loginService.login(loginEntity);
        log.info("提示点{}", loginEntity);
        return user != null?Result.ok(user):Result.fail("用户名或者密码错误");
    }
}
