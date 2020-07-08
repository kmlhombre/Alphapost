package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "like_comment")
public class Like_Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeID;

    @ManyToOne
    private Comment commentid;

    @ManyToOne
    private User userid;

    @NotNull
    private DateFormat date;

    public Like_Comment() {
    }

    public Like_Comment(Long likeID, User user, DateFormat date, Comment comment) {
        this.likeID = likeID;
        this.userid = user;
        this.date = date;
        this.commentid = comment;
    }

    public Comment getComment() {
        return commentid;
    }

    public void setComment(Comment comment) {
        this.commentid = comment;
    }

    public Long getLikeID() {
        return likeID;
    }

    public void setLikeID(Long likeID) {
        this.likeID = likeID;
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
