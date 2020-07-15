package com.alphapost.demo.models;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name="settings")
public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SettingsID;

    @ColumnDefault("false")
    private Boolean theme;

<<<<<<< Updated upstream
    @OneToOne(mappedBy = "user_settings")
    private User user;
=======
    private Long userid;
>>>>>>> Stashed changes

    public Settings() {
    }

    public Settings(Long settingsID, Boolean theme, Long user) {
        SettingsID = settingsID;
        this.theme = theme;
        this.user = user;
    }

    public Long getSettingsID() {
        return SettingsID;
    }

    public void setSettingsID(Long settingsID) {
        SettingsID = settingsID;
    }

    public Boolean getTheme() {
        return theme;
    }

    public void setTheme(Boolean theme) {
        this.theme = theme;
    }

<<<<<<< Updated upstream
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
=======
    public Long getUser() {
        return userid;
    }

    public void setUser(Long user) {
        this.userid = user;
>>>>>>> Stashed changes
    }
}
