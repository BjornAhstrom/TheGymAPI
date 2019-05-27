package com.example.TheGym;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GymInformation {

    public String name;
    public String adress;
    public String phoneNumber;
    public String mail;
    public String openingHours;
    public String closingHours;

    public List<Member> members;

    public GymInformation() {
    }

    public GymInformation(String name, String adress, String phoneNumber, String mail, String openingHours, String closingHours, List<Member> members) {
        this.name = "";
        this.adress = "";
        this.phoneNumber = "";
        this.mail = "";
        this.openingHours = "";
        this.closingHours = "";
        this.members = members;
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
        if (members == null) {
            return new ArrayList<>();
        }
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


    public void patch(Map<String, String> updateGym) {
        updateGym.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(GymInformation.class, key);
            ReflectionUtils.setField(field, this, value);
        });
    }

}
