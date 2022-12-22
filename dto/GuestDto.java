package com.example.mygatedsociety.dto;

import com.example.mygatedsociety.enums.Gender;


public class GuestDto {
    private String name;
    private String mobNo;
    private Gender gender;
    private String flatNo;
    private String address;

    public GuestDto(
            final String name,
            final String mobNo,
            final Gender gender,
            final String flatNo,
            final String address
    ) {
        this.name = name;
        this.mobNo = mobNo;
        this.gender = gender;
        this.flatNo = flatNo;
        this.address = address;
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

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(final String flatNo) {
        this.flatNo = flatNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}
