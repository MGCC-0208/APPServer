package com.service;

import com.dao.PostDao;
import com.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Package: com.service
 * @ClassName: PostServiceImpl
 * @Author:
 * @CreateTime: 2021/4/18 12:25
 * @Description:
 */
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;

    @Override
    public List<Post> selectPosts(String username) {
        return null;
    }

    @Override
    public List<Post> selectAllPosts() {
        return null;
    }

    @Override
    public int addPost(Post post) {
        return postDao.addPost(post);
    }
}
