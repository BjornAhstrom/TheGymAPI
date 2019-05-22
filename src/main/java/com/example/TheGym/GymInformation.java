package com.example.TheGym;

import java.util.ArrayList;
import java.util.List;

public class GymInformation {

    private String name;
    private String adress;
    private String phoneNumber;
    private String mail;
    private String openingHours;
    private String closingHours;

    public List<Member> members = new ArrayList<>();

    public GymInformation() {
    }

    public GymInformation(String name, String adress, String phoneNumber, String mail, String openingHours, String closingHours) {
        this.name = "";
        this.adress = "";
        this.phoneNumber = "";
        this.mail = "";
        this.openingHours = "";
        this.closingHours = "";
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public String getClosingHours() {
        return closingHours;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public void setClosingHours(String closingHours) {
        this.closingHours = closingHours;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
