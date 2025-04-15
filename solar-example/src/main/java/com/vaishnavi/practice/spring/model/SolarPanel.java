package com.vaishnavi.practice.spring.model;

public class SolarPanel {
    private String panelId;
    private String type;

    public SolarPanel() {}

    public SolarPanel(String panelId, String type) {
        this.panelId = panelId;
        this.type = type;
    }

    public String getPanelId() {
        return panelId;
    }

    public void setPanelId(String panelId) {
        this.panelId = panelId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


