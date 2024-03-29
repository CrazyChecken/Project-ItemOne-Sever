package com.zhaoyu.basis.BaseModules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Result {
    /**
     * 是否成功
     **/
    private Boolean isSuccess;
    /**
     * 返回信息
     **/
    private String Msg;
    /**
     * 请求状态 200-成功 400-失败
     **/
    private Integer status;
    /**
     * 当前时间戳
     **/
    private Long timestamp;
    /**
     * 返回结果
     **/
    private Object data;

    public static Result ok() {
        return new Result(true, "success", 200, System.currentTimeMillis(),null);
    }

    public static Result ok(Object data) {
        return new Result(true,"success",200,System.currentTimeMillis(),data);
    }

    public static Result ok(List<?> data) {
        return new Result(true, null, 200,System.currentTimeMillis(),data);
    }

    public static Result fail(String errorMsg) {
        return new Result(false, errorMsg, 400,System.currentTimeMillis(),null);
    }
}
