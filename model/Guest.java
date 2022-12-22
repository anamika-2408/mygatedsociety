package com.example.mygatedsociety.model;

import com.example.mygatedsociety.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long guestId;
    private String name;
    private String mobNo;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDateTime entryTime = LocalDateTime.now();
    private String flatNo;
    private String address;

    public Guest() {
    }

    public Guest(
            final long guestId,
            final String name,
            final String mobNo,
            final Gender gender,
            final LocalDateTime entryTime,
            final String flatNo,
            final String address
    ) {
        this.guestId = guestId;
        this.name = name;
        this.mobNo = mobNo;
        this.gender = gender;
        this.entryTime = entryTime;
        this.flatNo = flatNo;
        this.address = address;
    }

    public Guest(
            final long guestId,
            final String name,
            final String mobNo,
            final Gender gender,
            final LocalDateTime entryTime
    ) {
        this.guestId = guestId;
        this.name = name;
        this.mobNo = mobNo;
        this.gender = gender;
        this.entryTime = entryTime;
    }

    public Guest(
            final long guestId,
            final String name
    ) {
        this.guestId = guestId;
        this.name = name;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(final long guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(final String mobNo) {
        this.mobNo = mobNo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(final LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(final String flatNo) {
        this.flatNo = flatNo;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}
