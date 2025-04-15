package com.vaishnavi.practice.spring.service;

import com.vaishnavi.practice.spring.model.Installation;

public class SolarService {

    private String customerName;
    private Installation installation;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setInstallation(Installation installation) {
        this.installation = installation;
    }

    public void displayInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("Installation at: " + installation.getLocation());
        System.out.println("Panel Type: " + installation.getPanel().getType());
    }
}


