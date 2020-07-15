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

    private Long userid;

    public Settings(Long settingsID, Boolean theme, Long userid) {
        SettingsID = settingsID;
        this.theme = theme;
        this.userid = userid;
    }

    public Settings() {
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

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
