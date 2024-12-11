package com.example.bankapp.model;

public class Service {
    private String serviceName;
    private String description;

    public Service(String serviceName, String description) {
        this.serviceName = serviceName;
        this.description = description;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

