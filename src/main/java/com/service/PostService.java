package com.service;

import com.pojo.Post;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Package: com.service
 * @ClassName: PostService
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/16 21:13
 * @Description:
 */
public interface PostService {

    public List<Post> selectPosts(String username);
    public List<Post> selectAllPosts();
    public int addPost(Post post);


}
