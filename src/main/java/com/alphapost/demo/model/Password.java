package com.alphapost.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "password")
public class Password {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passwordID;

    @NotNull
    private String password;

    @OneToOne(mappedBy = "password")
    private User user;

    public Password(Long passwordID, String password, User user) {
        this.passwordID = passwordID;
        this.password = password;
        this.user = user;
    }

    public Long getPasswordID() {
        return passwordID;
    }

    public void setPasswordID(Long passwordID) {
        this.passwordID = passwordID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
