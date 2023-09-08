package com.zhaoyu.entity.BaseModules.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String mobile;
    private String password;
}
