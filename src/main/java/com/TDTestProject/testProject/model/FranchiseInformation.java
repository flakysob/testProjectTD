package com.TDTestProject.testProject.model;

import java.util.UUID;

public class FranchiseInformation {
    private final UUID id;
    private String franchiseName;
    private String location;

    public FranchiseInformation(UUID id, String franchiseName, String location) {
        this.id = id;
        this.franchiseName = franchiseName;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }


    public String getFranchiseName() {
        return franchiseName;
    }
    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }


    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
