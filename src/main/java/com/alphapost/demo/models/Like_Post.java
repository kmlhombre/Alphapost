package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "like_post")
public class Like_Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeID;

    @ManyToOne
    private Post post;

    @ManyToOne
    private User userid;

    @NotNull
    private DateFormat date;

    public Like_Post() {
    }

    public Like_Post(Long likeID, Post post, User user, DateFormat date) {
        this.likeID = likeID;
        this.post = post;
        this.userid = user;
        this.date = date;
    }

    public Long getLikeID() {
        return likeID;
    }

    public void setLikeID(Long likeID) {
        this.likeID = likeID;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return userid;
    }

    public void setUser(User user) {
        this.userid = user;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }
}
