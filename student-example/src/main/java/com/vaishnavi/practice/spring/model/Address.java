package com.vaishnavi.practice.spring.model;

public class Address {
    private String city;
    private String zipCode;

    // Constructor
    public Address(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    // Getters and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

