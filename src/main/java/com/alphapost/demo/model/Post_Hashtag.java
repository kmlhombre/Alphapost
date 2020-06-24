package com.alphapost.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "post_hashtag")
public class Post_Hashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Hashtag hashtag;

    @ManyToOne
    private Post post;

    public Post_Hashtag(Long id, Hashtag hashtag, Post post) {
        this.id = id;
        this.hashtag = hashtag;
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hashtag getHashtag() {
        return hashtag;
    }

    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
