package com.zhaoyu.sever;

import com.zhaoyu.basis.PasswordEncrypt;
import com.zhaoyu.domain.User;
import com.zhaoyu.entity.request.LoginRequest;
import com.zhaoyu.mapper.LoginMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginService {
//    @Autowired
//    private PasswordEncrypt passwordEncrypt;

    @Autowired
    private LoginMapper loginMapper;
    public User login(LoginRequest loginEntity) {
        PasswordEncrypt passwordEncrypt = new PasswordEncrypt();
        String pwd = passwordEncrypt.MD5(loginEntity.getPassword());
        log.info(pwd);
        loginEntity.setPassword(pwd);
        return loginMapper.getByUsernameAndPassword(loginEntity);
    }
}
