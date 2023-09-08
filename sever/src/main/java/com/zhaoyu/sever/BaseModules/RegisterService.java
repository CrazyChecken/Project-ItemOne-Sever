package com.zhaoyu.sever.BaseModules;

import com.zhaoyu.basis.BaseModules.PasswordEncrypt;
import com.zhaoyu.basis.BaseModules.Result;
import com.zhaoyu.domain.BaseModules.User;
import com.zhaoyu.domain.BaseModules.UserRepo;
import com.zhaoyu.entity.BaseModules.reponse.RegisterVo;
import com.zhaoyu.mapper.BaseModules.RegisterMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegisterService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RegisterMapper registerMapper;

    public RegisterVo register(User user) {
        User user1 = registerMapper.findByMobile(user.getMobile());
        if (user1 == null) {
            PasswordEncrypt passwordEncrypt = new PasswordEncrypt();
            String pwd = passwordEncrypt.MD5(user.getPassword());
            User newuser = new User();
            newuser.setName(user.getName());
            newuser.setMobile(user.getMobile());
            newuser.setPassword(pwd);
            newuser.setGender(user.getGender());
            newuser.setEthnic(user.getEthnic());
            newuser.setAddress(user.getAddress());
            userRepo.save(newuser);
            RegisterVo registerVo = new RegisterVo();

            log.info(pwd);
            Result result = Result.ok(newuser);
            registerVo.setData(result);
            return registerVo;
        }
        RegisterVo registerVo =  new RegisterVo();
        registerVo.setData(Result.fail("该手机号已被注册！"));
        return registerVo;
    }
}
