package com.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Package: com.pojo
 * @ClassName: User
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 9:35
 * @Description:
 */
@Component("user")
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
