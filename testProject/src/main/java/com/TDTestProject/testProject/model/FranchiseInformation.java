package com.TDTestProject.testProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class FranchiseInformation {
    @JsonProperty("id")
    private final UUID id;
    @JsonProperty("franchiseName")
    private String franchiseName;
    @JsonProperty("location")
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
