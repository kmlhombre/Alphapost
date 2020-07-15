package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "like_post")
public class Like_Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeID;

    private Long post;

    private Long userid;

    @NotNull
    private Date date;

    public Like_Post(Long likeID, Long post, Long userid, Date date) {
        this.likeID = likeID;
        this.post = post;
        this.userid = userid;
        this.date = date;
    }

    public Like_Post() {
    }

    public Long getLikeID() {
        return likeID;
    }

    public void setLikeID(Long likeID) {
        this.likeID = likeID;
    }

    public Long getPost() {
        return post;
    }

    public void setPost(Long post) {
        this.post = post;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
