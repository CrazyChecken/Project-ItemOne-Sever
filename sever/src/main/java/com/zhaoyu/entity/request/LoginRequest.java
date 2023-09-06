package com.zhaoyu.entity.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String mobile;
    private String password;
}
