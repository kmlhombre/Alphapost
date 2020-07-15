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

    private Long post;

<<<<<<< Updated upstream
    @ManyToOne
    private User user;
=======
    private Long userid;
>>>>>>> Stashed changes

    @NotNull
    private DateFormat date;

    public Like_Post() {
    }

    public Like_Post(Long likeID, Long post, Long user, DateFormat date) {
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

    public Long getPost() {
        return post;
    }

    public void setPost(Long post) {
        this.post = post;
    }

<<<<<<< Updated upstream
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
=======
    public Long getUser() {
        return userid;
    }

    public void setUser(Long user) {
        this.userid = user;
>>>>>>> Stashed changes
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }
}
