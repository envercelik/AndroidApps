package com.example.app024sendsmsormailormakecall;

public class User {

    private String id;
    private String nameSurname;
    private String phoneNumber;
    private int photoId;
    private String mailAddress;

    public User(String id, String nameSurname, String phoneNumber, int photoId ,String mailAddress) {
        this.id = id;
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.photoId = photoId;
        this.mailAddress = mailAddress;
    }


    public String getId() {
        return id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getMailAddress() {
        return mailAddress;
    }
}
