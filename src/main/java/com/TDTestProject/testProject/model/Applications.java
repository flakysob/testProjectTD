package com.TDTestProject.testProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;

import java.util.UUID;

public class Applications {
    private final UUID id;
    @NotBlank
    private String fullName;
    private String tcIdentityNumber;
    private String address;
    private String phoneNumber;
    private String email;
    private String birthDate;
    private boolean hasRetailExperience; //Perakende tecrübesi
    private String reasonForChoosingLokumcuBaba; //Lokumcı Baba'yı tercih etmenizin sebebi nedir?
    private String location;
    private double investmentAmount; //Yatırım miktarı
    private String additionalNotes; //Eklenmek istenen notlar


    public Applications(
            @JsonProperty("id")
            UUID id,
            @JsonProperty("name")
            String fullName,
            @JsonProperty("tcIdentityNumber")
            String tcIdentityNumber,
            @JsonProperty("address")
            String address,
            @JsonProperty("phoneNumber")
            String phoneNumber,
            @JsonProperty("email")
            String email,
            @JsonProperty("birthDate")
            String birthDate,
            @JsonProperty("hasRetailExperience")
            boolean hasRetailExperience,
            @JsonProperty("reasonForChoosingLokumcuBaba")
            String reasonForChoosingLokumcuBaba,
            @JsonProperty("location")
            String location,
            @JsonProperty("investmentAmount")
            double investmentAmount,
            @JsonProperty("additionalNotes")
            String additionalNotes
    ) {
        this.id = id;
        this.fullName = fullName;
        this.tcIdentityNumber = tcIdentityNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
        this.hasRetailExperience = hasRetailExperience;
        this.reasonForChoosingLokumcuBaba = reasonForChoosingLokumcuBaba;
        this.location = location;
        this.investmentAmount = investmentAmount;
        this.additionalNotes = additionalNotes;
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
