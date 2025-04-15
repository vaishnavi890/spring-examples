package com.vaishnavi.practice.spring.model;

public class Installation {
    private String location;
    private SolarPanel panel;

    public Installation() {}

    public Installation(String location, SolarPanel panel) {
        this.location = location;
        this.panel = panel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SolarPanel getPanel() {
        return panel;
    }

    public void setPanel(SolarPanel panel) {
        this.panel = panel;
    }
}



