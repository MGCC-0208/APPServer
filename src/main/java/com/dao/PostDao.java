package com.dao;

import com.pojo.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: com.dao
 * @ClassName: ReleaseDao
 * @Author: SHARPSZHANG
 * @CreateTime: 2021/4/18 12:16
 * @Description:
 */
@Repository("releaseDap")
public interface PostDao {

    public List<Post> selectPosts(String username);
    public List<Post> selectAllPosts();
    public int addPost(Post post);
}
