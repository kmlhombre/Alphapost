package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentID;

    private Long author;

    private Long post;

    @NotNull
    private String text;

    @NotNull
    private Date date;

    public Comment(Long commentID, Long author, Long post, String text, Date date) {
        this.commentID = commentID;
        this.author = author;
        this.post = post;
        this.text = text;
        this.date = date;
    }

    public Comment() {
    }

    public Long getCommentID() {
        return commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public Long getPost() {
        return post;
    }

    public void setPost(Long post) {
        this.post = post;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
