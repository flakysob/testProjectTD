package com.TDTestProject.testProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class StatusOfApplications {
    @JsonProperty("id")
    private final UUID id;
    @JsonProperty("status")
    private String status;

    public StatusOfApplications(UUID id, String status){
        this.id = id;
        this.status = status;
    }


    public UUID getId() {
        return id;
    }


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        status = status;
    }
}
