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

    private Long userid;

    public Password(Long passwordID, String password, Long userid) {
        this.passwordID = passwordID;
        this.password = password;
        this.userid = userid;
    }

    public Password() {
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

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
