package com.alphapost.demo.models;

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

<<<<<<< Updated upstream
    private long userid;
=======
    private Long userid;
>>>>>>> Stashed changes

    public Password() {
    }

<<<<<<< Updated upstream
    public Password(Long passwordID, String password, long userid) {
=======
    public Password(Long passwordID, String password, Long userid) {
>>>>>>> Stashed changes
        this.passwordID = passwordID;
        this.password = password;
        this.userid = userid;
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

<<<<<<< Updated upstream
    public long getUser() {
        return userid;
    }

    public void setUser(long user) {
        this.userid = user;
=======
    public Long getUser() {
        return userid;
    }

    public void setUser(Long userid) {
        this.userid = userid;
>>>>>>> Stashed changes
    }
}
