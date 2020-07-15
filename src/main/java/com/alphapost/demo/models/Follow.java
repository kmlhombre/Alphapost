package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "follow")
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long followID;

    private Long who;

    private Long whom;

    private Date date;

    public Follow(Long followID, Long who, Long whom, Date date) {
        this.followID = followID;
        this.who = who;
        this.whom = whom;
        this.date = date;
    }

    public Follow() {
    }

    public Long getFollowID() {
        return followID;
    }

    public void setFollowID(Long followID) {
        this.followID = followID;
    }

    public Long getWho() {
        return who;
    }

    public void setWho(Long who) {
        this.who = who;
    }

    public Long getWhom() {
        return whom;
    }

    public void setWhom(Long whom) {
        this.whom = whom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
