package com.controller;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Package: com.controller
 * @ClassName: UserController
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 15:36
 * @Description:
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @GetMapping("/select")
    public String findAllUsers(Model model){
        List<User> users = userDao.selectAllUsers();
        model.addAttribute("users", users);
        System.out.println("SelectAllUsers");
        return "aaa";
    }
}
