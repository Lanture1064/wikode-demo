package com.wikode.data.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private String title;
    private Integer currentVersionID;
    private Integer previousVersionID;

    public Integer getID() {
        return ID;
    }

    public void setEntryID(Integer ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCurrentVersionID() {
        return currentVersionID;
    }

    public void setCurrentVersionID(Integer currentVersionID) {
        this.currentVersionID = currentVersionID;
    }

    public Integer getPreviousVersionID() {
        return previousVersionID;
    }

    public void setPreviousVersionID(Integer previousVersionID) {
        this.previousVersionID = previousVersionID;
    }
}
