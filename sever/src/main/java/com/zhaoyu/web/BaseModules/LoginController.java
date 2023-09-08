package com.zhaoyu.web.BaseModules;

import com.zhaoyu.basis.BaseModules.Result;
import com.zhaoyu.domain.BaseModules.User;
import com.zhaoyu.entity.BaseModules.request.LoginRequest;
import com.zhaoyu.sever.BaseModules.LoginService;
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
        log.info("日志：{}", loginEntity);
        return user != null?Result.ok(user):Result.fail("用户名或者密码错误");
    }
}