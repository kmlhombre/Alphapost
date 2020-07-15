package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageID;

    @NotNull
    private String message;

    private Long user_from;

    private Long user_to;

    private DateFormat date;

    public Message() {
    }

    public Message(Long messageID, String message, Long user_from, Long user_to, DateFormat date) {
        this.messageID = messageID;
        this.message = message;
        this.user_from = user_from;
        this.user_to = user_to;
        this.date = date;
    }

    public Long getMessageID() {
        return messageID;
    }

    public void setMessageID(Long messageID) {
        this.messageID = messageID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getUser_from() {
        return user_from;
    }

    public void setUser_from(Long user_from) {
        this.user_from = user_from;
    }

    public Long getUser_to() {
        return user_to;
    }

    public void setUser_to(Long user_to) {
        this.user_to = user_to;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }
}
