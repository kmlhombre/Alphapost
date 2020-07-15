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

<<<<<<< Updated upstream
    @ManyToOne
    private Comment comment;

    @ManyToOne
    private User user;
=======
    private Long commentid;

    private Long userid;
>>>>>>> Stashed changes

    @NotNull
    private DateFormat date;

    public Like_Comment() {
    }

    public Like_Comment(Long likeID, Long user, DateFormat date, Long comment) {
        this.likeID = likeID;
        this.user = user;
        this.date = date;
        this.comment = comment;
    }

<<<<<<< Updated upstream
    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
=======
    public Long getComment() {
        return commentid;
    }

    public void setComment(Long comment) {
        this.commentid = comment;
>>>>>>> Stashed changes
    }

    public Long getLikeID() {
        return likeID;
    }

    public void setLikeID(Long likeID) {
        this.likeID = likeID;
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
