package com.zhaoyu.web.BaseModules;

import com.zhaoyu.domain.BaseModules.User;
import com.zhaoyu.entity.BaseModules.reponse.RegisterVo;
import com.zhaoyu.sever.BaseModules.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@Slf4j
@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;


    @PostMapping("/register")
    public RegisterVo register(
            @RequestBody User user
            ) {
        RegisterVo registerVo =  registerService.register(user);
        return registerVo;
    }


}