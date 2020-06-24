package com.alphapost.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Set;

@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatID;

    @ManyToOne
    private User user1;

    @ManyToOne
    private User user2;

    public Chat(Long chatID, User user1, User user2) {
        this.chatID = chatID;
        this.user1 = user1;
        this.user2 = user2;
    }

    public Long getChatID() {
        return chatID;
    }

    public void setChatID(Long chatID) {
        this.chatID = chatID;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }
}
