package com.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Package: com.pojo
 * @ClassName: Post
 * @Author: SHARPSHZANG
 * @CreateTime: 2021/4/18 12:17
 * @Description:
 */
@Component("post")
public class Post {
    private int postId;
    private String postUser;
    private String postContent;
    private String postDate;

    public Post() {
    }

    public Post(int postId, String postUser, String postContent, String postDate) {
        this.postId = postId;
        this.postUser = postUser;
        this.postContent = postContent;
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postUser='" + postUser + '\'' +
                ", postContent='" + postContent + '\'' +
                ", postDate='" + postDate + '\'' +
                '}';
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setPostUser(String postUser) {
        this.postUser = postUser;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public void setPostDate(String dateTime) {
        this.postDate = dateTime;
    }

    public int getPostId() {
        return postId;
    }

    public String getPostUser() {
        return postUser;
    }

    public String getPostContent() {
        return postContent;
    }

    public String getPostDate() {
        return postDate;
    }
}
