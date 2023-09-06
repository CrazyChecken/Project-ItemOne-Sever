package com.zhaoyu.sever;

import antlr.StringUtils;
import com.zhaoyu.domain.User;
import com.zhaoyu.domain.UserRepo;
import com.zhaoyu.entity.Vo.RegisterVo;
import com.zhaoyu.mapper.RegisterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RegisterMapper registerMapper;

    public RegisterVo register(User user) {
        User user1 = registerMapper.findByMobile(user.getMobile());
        if (user1 == null) {
            User newuser = new User();
            newuser.setName(user.getName());
            newuser.setMobile(user.getMobile());
            newuser.setPassword(user.getPassword());
            newuser.setGender(user.getGender());
            newuser.setEthnic(user.getEthnic());
            newuser.setAddress(user.getAddress());
            userRepo.save(newuser);
            RegisterVo registerVo = new RegisterVo();
            registerVo.setMsg("注册成功");
            registerVo.setData(newuser);
            return registerVo;
        }
        RegisterVo registerVo =  new RegisterVo();
        registerVo.setMsg("该手机号已存在");
        return registerVo;
    }
}
