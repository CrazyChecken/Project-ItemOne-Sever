package com.zhaoyu.entity.reponse;

import com.zhaoyu.basis.Result;
import com.zhaoyu.domain.User;
import lombok.Data;

@Data
public class RegisterVo{
    private Result data;

    public RegisterVo() {
    }

    public RegisterVo(Result result) {
    }
}
