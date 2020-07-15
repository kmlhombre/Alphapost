package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "like_comment")
public class Like_Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeID;

    private Long commentid;

    private Long userid;

    @NotNull
    private Date date;

    public Like_Comment(Long likeID, Long commentid, Long userid, Date date) {
        this.likeID = likeID;
        this.commentid = commentid;
        this.userid = userid;
        this.date = date;
    }

    public Like_Comment() {
    }

    public Long getLikeID() {
        return likeID;
    }

    public void setLikeID(Long likeID) {
        this.likeID = likeID;
    }

    public Long getCommentid() {
        return commentid;
    }

    public void setCommentid(Long commentid) {
        this.commentid = commentid;
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
