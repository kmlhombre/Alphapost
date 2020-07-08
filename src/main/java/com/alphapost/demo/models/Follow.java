package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "follow")
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long followID;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private User who;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private User whom;

    private DateFormat date;

    public Follow() {
    }

    public Follow(Long followID, User whoID, User whomID, DateFormat date) {
        this.followID = followID;
        this.who = whoID;
        this.whom = whomID;
        this.date = date;
    }

    public Long getFollowID() {
        return followID;
    }

    public void setFollowID(Long followID) {
        this.followID = followID;
    }

    public User getWhoID() {
        return who;
    }

    public void setWhoID(User whoID) {
        this.who = whoID;
    }

    public User getWhomID() {
        return whom;
    }

    public void setWhomID(User whomID) {
        this.whom = whomID;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }
}
