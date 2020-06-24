package com.alphapost.demo.model;

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

    @OneToOne(mappedBy = "user_settings")
    private User user;

    public Settings(Long settingsID, Boolean theme, User user) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
