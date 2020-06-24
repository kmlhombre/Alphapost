package com.alphapost.demo.model;

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
    private User user;

    @NotNull
    private DateFormat date;

    public Like_Post(Long likeID, Post post, User user, DateFormat date) {
        this.likeID = likeID;
        this.post = post;
        this.user = user;
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
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }
}
