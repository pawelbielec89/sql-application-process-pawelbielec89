package com.codecool.simpleSQLapplication.model;

public class Mentor{
    private int id;
    private String name;
    private String surName;
    private String nickName;
    private int phoneNumber;
    private String eMail;
    private String city;
    private int favouriteNumber;

    public Mentor (int id, String name, String surName, String nickName, int phoneNumber, String eMail, String city,
                   int favouriteNumber){
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.city = city;
        this.favouriteNumber = favouriteNumber;
    }

    public int getId() {

        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() { return eMail; }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFavouriteNumber() {
        return favouriteNumber;
    }

    public void setFavouriteNumber(int favouriteNumber) {
        this.favouriteNumber = favouriteNumber;
    }
}