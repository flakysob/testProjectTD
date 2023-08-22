package com.TDTestProject.testProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Applications {
    @JsonProperty("id")
    private final UUID id;
    @JsonProperty("name")
    private String fullName;
    @JsonProperty("tcIdentityNumber")
    private String tcIdentityNumber;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("hasRetailExperience")
    private boolean hasRetailExperience; //Perakende tecrübesi
    @JsonProperty("reasonForChoosingLokumcuBaba")
    private String reasonForChoosingLokumcuBaba; //Lokumcı Baba'yı tercih etmenizin sebebi nedir?
    @JsonProperty("location")
    private String location;
    @JsonProperty("investmentAmount")
    private double investmentAmount; //Yatırım miktarı
    @JsonProperty("additionalNotes")
    private String additionalNotes; //Eklenmek istenen notlar


    public Applications(UUID id, String fullName, String tcIdentityNumber) {
        this.id = id;
        this.fullName = fullName;
        this.tcIdentityNumber = tcIdentityNumber;
    }


    public UUID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTcIdentityNumber() {
        return tcIdentityNumber;
    }

    public void setTcIdentityNumber(String tcIdentityNumber) {
        this.tcIdentityNumber = tcIdentityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isHasRetailExperience() {
        return hasRetailExperience;
    }

    public void setHasRetailExperience(boolean hasRetailExperience) {
        this.hasRetailExperience = hasRetailExperience;
    }

    public String getReasonForChoosingLokumcuBaba() {
        return reasonForChoosingLokumcuBaba;
    }

    public void setReasonForChoosingLokumcuBaba(String reasonForChoosingLokumcuBaba) {
        this.reasonForChoosingLokumcuBaba = reasonForChoosingLokumcuBaba;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }
}
