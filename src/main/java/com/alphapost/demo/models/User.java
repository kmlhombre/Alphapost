package com.alphapost.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Long UserID;

    @NotNull
    @Column(unique = true, name = "username")
    private String username;

    @NotNull
    @Column(unique = true, name = "email")
    private String email;

    @Column(name = "status")
    private String status;

    @Column(name = "date")
    private DateFormat date;

    @Column(name = "main_photo")
    private String main_photo;

    @Column(name = "description")
    private String description;

    @Column(name = "suspended")
    private Boolean suspended;

    public User(Long userID, String username, String email, String status, DateFormat date, String main_photo, String description, Boolean suspended, Settings user_settings, Password password) {
        UserID = userID;
        this.username = username;
        this.email = email;
        this.status = status;
        this.date = date;
        this.main_photo = main_photo;
        this.description = description;
        this.suspended = suspended;
        this.user_settings = user_settings;
        this.password = password;
    }

    public User() {
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private Settings user_settings;

    @OneToOne(cascade = CascadeType.ALL)
    private Password password;

    public User(Long userID, String username, String email, String status, DateFormat date, String main_photo, String description, Settings user_settings, Password password) {
        UserID = userID;
        this.username = username;
        this.email = email;
        this.status = status;
        this.date = date;
        this.main_photo = main_photo;
        this.description = description;
        this.user_settings = user_settings;
        this.password = password;
        this.suspended = false;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long UserID) {
        this.UserID = UserID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Settings getUser_settings() {
        return user_settings;
    }

    public void setUser_settings(Settings user_settings) {
        this.user_settings = user_settings;
    }

    public String getStatus() {
        return status;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public String getMain_photo() {
        return main_photo;
    }

    public void setMain_photo(String main_photo) {
        this.main_photo = main_photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
