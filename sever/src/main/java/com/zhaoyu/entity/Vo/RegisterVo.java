package com.zhaoyu.entity.Vo;

import com.zhaoyu.domain.User;
import lombok.Data;

@Data
public class RegisterVo {
    private String msg;

    private User data;

    public RegisterVo() {
    }

    public RegisterVo(String msg,User user) {
    }
}
