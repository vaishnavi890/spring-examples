package com.vaishnavi.practice.spring.model;

public class Address {
    private City city;

    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
