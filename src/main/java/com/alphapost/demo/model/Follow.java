package com.alphapost.demo.model;

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
    private User whoID;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private User whomID;

    private DateFormat date;

    public Follow() {
    }

    public Follow(Long followID, User whoID, User whomID, DateFormat date) {
        this.followID = followID;
        this.whoID = whoID;
        this.whomID = whomID;
        this.date = date;
    }

    public Long getFollowID() {
        return followID;
    }

    public void setFollowID(Long followID) {
        this.followID = followID;
    }

    public User getWhoID() {
        return whoID;
    }

    public void setWhoID(User whoID) {
        this.whoID = whoID;
    }

    public User getWhomID() {
        return whomID;
    }

    public void setWhomID(User whomID) {
        this.whomID = whomID;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }
}
