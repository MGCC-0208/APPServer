package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dao.PostDao;
import com.pojo.Msg;
import com.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Package: com.controller
 * @ClassName: PostController
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/18 12:37
 * @Description:
 */
@Controller
public class PostController {
    @Autowired
    private Msg msg;
    @Autowired
    private Post post;
    @Autowired
    private PostDao postDao;
    private String data;

    @PostMapping("/releasePost")
    public void releasePost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        msg.clearMsg();
        response.setContentType("text/html;charset=UTF-8");
        post.setPostUser(request.getParameter("username"));
        post.setPostContent(request.getParameter("content"));
        post.setPostDate(request.getParameter("date"));
        if(postDao.addPost(post) > 0){
            msg.setCode("true");
        } else {
            msg.setCode("false");
            msg.setMessage("出现未知错误");
        }
        data = JSON.toJSONString(msg);
        response.getWriter().println(data);
    }

    @RequestMapping("/selectPosts")
    public void selectPosts(HttpServletRequest request, HttpServletResponse response) throws IOException {
        msg.clearMsg();
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        List<Post> posts = postDao.selectPosts(username);
        data = JSON.toJSONString(posts);
        response.getWriter().println(data);
    }
}
