package com.alphapost.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatID;

    private Long userid1;

    private Long userid2;

    public Chat(Long chatID, Long userid1, Long userid2) {
        this.chatID = chatID;
        this.userid1 = userid1;
        this.userid2 = userid2;
    }

    public Chat() {
    }

    public Long getChatID() {
        return chatID;
    }

    public void setChatID(Long chatID) {
        this.chatID = chatID;
    }

    public Long getUserid1() {
        return userid1;
    }

    public void setUserid1(Long userid1) {
        this.userid1 = userid1;
    }

    public Long getUserid2() {
        return userid2;
    }

    public void setUserid2(Long userid2) {
        this.userid2 = userid2;
    }
}
