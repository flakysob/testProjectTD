package com.TDTestProject.testProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class StatusOfApplications {
    @JsonProperty("id")
    private final String id;
    @JsonProperty("status")
    private String status;

    public StatusOfApplications(String id, String status){
        this.id = id;
        this.status = status;
    }


    public String getId() {
        return id;
    }


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        status = status;
    }
}
