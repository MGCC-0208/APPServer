package com.dao;

import com.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: com.dao
 * @ClassName: UserDao
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 9:36
 * @Description:
 */
@Repository("userDao")
public interface UserDao {
    public List<User> selectAllUsers();

}
