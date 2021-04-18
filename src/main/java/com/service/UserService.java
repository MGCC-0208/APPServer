package com.service;

import com.pojo.User;

import java.util.List;

/**
 * @Package: com.dao
 * @ClassName: UserDao
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 9:36
 * @Description:
 */
public interface UserService {
    public List<User> selectAllUsers();

}
