package com.alphapost.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "post_hashtag")
public class Post_Hashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long hashtag;

    private Long post;

    public Post_Hashtag(Long id, Long hashtag, Long post) {
        this.id = id;
        this.hashtag = hashtag;
        this.post = post;
    }

    public Post_Hashtag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHashtag() {
        return hashtag;
    }

    public void setHashtag(Long hashtag) {
        this.hashtag = hashtag;
    }

    public Long getPost() {
        return post;
    }

    public void setPost(Long post) {
        this.post = post;
    }
}
