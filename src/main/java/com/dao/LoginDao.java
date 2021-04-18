package com.dao;

import com.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.dao
 * @ClassName: LoginDao
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 21:06
 * @Description:
 */
@Repository("loginDao")
public interface LoginDao {
    /**
     * 登陆验证
     * @param user 用户名+密码
     * @return 用户存在则返回该条数据， 否则返回false/Null
     */
    public User selectUser(User user);
    public User selectUsername(String username);
    public int addUser(User user);


}
