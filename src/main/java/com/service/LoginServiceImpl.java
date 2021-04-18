package com.service;

import com.dao.LoginDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Package: com.service
 * @ClassName: LoginServiceImpl
 * @Author:
 * @CreateTime: 2021/4/16 21:15
 * @Description:
 */
@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;
    /**
     * 登陆
     * @param user 用户名+密码
     * @return 查找结果
     */
    @Override
    public User selectUser(User user) {
        return loginDao.selectUser(user);
    }

    @Override
    public User selectUsername(String username) {
        return loginDao.selectUsername(username);
    }

    @Override
    public int addUser(User user) {
        if(selectUsername(user.getUsername()) != null){
            return loginDao.addUser(user);
        }
        return 0;
    }
}
