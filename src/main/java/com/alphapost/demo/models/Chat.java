package com.alphapost.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatID;

<<<<<<< Updated upstream
    @ManyToOne
    private User user1;

    @ManyToOne
    private User user2;
=======
    private Long userid1;

    private Long userid2;
>>>>>>> Stashed changes

    public Chat() {
    }

    public Chat(Long chatID, Long user1, Long user2) {
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

<<<<<<< Updated upstream
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
=======
    public Long getUser1() {
        return userid1;
    }

    public void setUser1(Long user1) {
        this.userid1 = user1;
    }

    public Long getUser2() {
        return userid2;
    }

    public void setUser2(Long user2) {
        this.userid2 = user2;
>>>>>>> Stashed changes
    }
}
