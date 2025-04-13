package com.vaishnavi.practice.spring.model;

public class Student {
    private String name;
    private int rollNumber;
    private Address address;

    // Constructor
    public Student(String name, int rollNumber, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Student: " + name +
                ", Roll Number: " + rollNumber +
                ", City: " + address.getCity() +
                ", Zip: " + address.getZipCode());
    }
}


