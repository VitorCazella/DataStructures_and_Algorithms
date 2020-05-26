package com.gofly;

public class Human {
    // data field -- access modifier -- private, protected, public
    public String name;
    private int phoneNumber;
    private String address;

    //constructor

    public Human(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Human() {
        //empty constructor
    }

    //getter methods
    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void welcomeToNew() {
        System.out.println("Welcome to " + name);
    }

    public int getSpecificPersonPhone() {
        int phone = 0;
        if(name == "Jack"){
            phone = phoneNumber;
        }
        return phone;
    }
}
