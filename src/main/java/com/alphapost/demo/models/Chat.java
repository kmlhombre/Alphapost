package com.alphapost.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatID;

    @ManyToOne
    private User userid1;

    @ManyToOne
    private User userid2;

    public Chat() {
    }

    public Chat(Long chatID, User user1, User user2) {
        this.chatID = chatID;
        this.userid1 = user1;
        this.userid2 = user2;
    }

    public Long getChatID() {
        return chatID;
    }

    public void setChatID(Long chatID) {
        this.chatID = chatID;
    }

    public User getUser1() {
        return userid1;
    }

    public void setUser1(User user1) {
        this.userid1 = user1;
    }

    public User getUser2() {
        return userid2;
    }

    public void setUser2(User user2) {
        this.userid2 = user2;
    }
}
