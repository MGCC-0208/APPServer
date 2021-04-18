package com.controller;

import com.alibaba.fastjson.JSON;
import com.dao.LoginDao;
import com.pojo.Msg;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Package: com.controller
 * @ClassName: LoginController
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 20:45
 * @Description:
 */
@Controller
public class LoginController {

    @Autowired
    private Msg msg;
    @Autowired
    private User user;
    @Autowired
    private LoginDao loginDao;
    @PostMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        msg.clearMsg();
        response.setContentType("text/html;charset=UTF-8");
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        if(loginDao.selectUser(user) != null){
            msg.setCode("true");
        } else {
            msg.setCode("false");
            msg.setMessage("账号或密码错误");
        }
        String data = JSON.toJSONString(msg);
        response.getWriter().println(data);
    }
    @PostMapping("/signUp")
    public void signUp(HttpServletRequest request, HttpServletResponse response) throws IOException {
        msg.clearMsg();
        response.setContentType("text/html;charset=UTF-8");
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        if(loginDao.selectUsername(user.getUsername()) == null){
            if(loginDao.addUser(user) > 0){
                msg.setCode("true");
                msg.setMessage("注册成功");
            } else {
                msg.setCode("false");
                msg.setMessage("出现未知错误");
            }
        } else {
            msg.setCode("false");
            msg.setMessage("该账号已存在");
        }
        String data = JSON.toJSONString(msg);
        response.getWriter().println(data);
    }
}
