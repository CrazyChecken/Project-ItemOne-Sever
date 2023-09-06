package com.zhaoyu.sever;

import com.zhaoyu.domain.User;
import com.zhaoyu.entity.request.LoginRequest;
import com.zhaoyu.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;
    public User login(LoginRequest loginEntity) {
        return loginMapper.getByUsernameAndPassword(loginEntity);
    }
}
