package com.derat.deratapp2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * This Class represents an intervention
 * Every time a operator make a new intervention*/
@Entity
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private LocalDate date;
    private byte trapsNum;
    private boolean baitEaten;
    private boolean trapsChanged;
    private byte numOfBaitChanged;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Worksite worksite;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isBaitEaten() {
        return baitEaten;
    }

    public void setBaitEaten(boolean baitEaten) {
        this.baitEaten = baitEaten;
    }

    public boolean isTrapsChanged() {
        return trapsChanged;
    }

    public void setTrapsChanged(boolean trapsChanged) {
        this.trapsChanged = trapsChanged;
    }

    public byte getNumOfBaitChanged() {
        return numOfBaitChanged;
    }

    public void setNumOfBaitChanged(byte numOfBaitChanged) {
        this.numOfBaitChanged = numOfBaitChanged;
    }

    public Worksite getWorksite() {
        return worksite;
    }

    public void setWorksite(Worksite worksite) {
        this.worksite = worksite;
    }

    public byte getTrapsNum() {
        return trapsNum;
    }

    public void setTrapsNum(byte trapsNum) {
        this.trapsNum = trapsNum;
    }
}
