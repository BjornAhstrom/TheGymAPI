package com.example.TheGym;

import java.util.UUID;

public class Employee {

    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String adress;
    private String phoneNumber;
    private String mail;

    public Employee() {
        this.id = UUID.randomUUID().toString().replace("-", "");
    }

    public Employee(String userName, String firstName, String lastName, String adress, String phoneNumber, String mail, String id) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public String getId() {
        return id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public void setId(String id) {
        this.id = id;
    }
}
