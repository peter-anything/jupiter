package com.galaxy.jupiter.client.common;

import org.springframework.lang.NonNull;

public class ResponseBean<T> {
    // http 状态码
    private String code;
    // 返回信息
    private String msg;
    // 返回的数据
    private  T data;

    public ResponseBean(String code, String msg, @NonNull T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}