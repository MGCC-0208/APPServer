package com.example.demo;

import com.dao.UserDao;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Package: com.example.demo
 * @ClassName: Main
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 9:40
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) context.getBean("userDao");
//        userDao.show();
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        List<User> users = (List<User>) sqlSession.getMapper(User.class);
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }
}
