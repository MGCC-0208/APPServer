package com.pojo;

import org.springframework.stereotype.Component;

/**
 * @Package: com.pojo
 * @ClassName: msg
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 20:55
 * @Description:
 */
@Component("msg")
public class Msg {
    private String code;
    private String message;

    public Msg() {
    }

    public Msg(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    public void clearMsg(){
        this.code = null;
        this.message = null;
    }
}
