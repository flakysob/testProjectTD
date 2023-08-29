package com.TDTestProject.testProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FranchiseInformation {
    @JsonProperty("id")
    private final String id;
    @JsonProperty("franchiseName")
    private String franchiseName;
    @JsonProperty("location")
    private String location;

    public FranchiseInformation(String id, String franchiseName, String location) {
        this.id = id;
        this.franchiseName = franchiseName;
        this.location = location;
    }

    public String getId() {
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
