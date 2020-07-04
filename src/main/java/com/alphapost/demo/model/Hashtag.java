package com.alphapost.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "hashtag")
public class Hashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hashtagID;

    @NotNull
    private String name;

    public Hashtag() {
    }

    public Hashtag(Long hashtagID, String name) {
        this.hashtagID = hashtagID;
        this.name = name;
    }

    public Long getHashtagID() {
        return hashtagID;
    }

    public void setHashtagID(Long hashtagID) {
        this.hashtagID = hashtagID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
