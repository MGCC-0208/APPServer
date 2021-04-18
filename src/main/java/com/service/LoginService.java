package com.service;

import com.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Package: com.service
 * @ClassName: LoginService
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 21:13
 * @Description:
 */
public interface LoginService {
    /**
     * 登陆
     * @param user 用户
     * @return 查找结果
     */
    public User selectUser(User user);
    public User selectUsername(String username);
    public int addUser(User user);
}
