package com.TDTestProject.testProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name = "applications")
public class Applications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final UUID id;
    @NotBlank
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "tc_identity_number")
    private String tcIdentityNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "birth_date")
    private String birthDate;
    @Column(name = "has_retail_experience")
    private boolean hasRetailExperience; //Perakende tecrübesi
    @Column(name = "reason_for_choosing")
    private String reasonForChoosingLokumcuBaba; //Lokumcı Baba'yı tercih etmenizin sebebi nedir?
    @Column(name = "location")
    private String location;
    @Column(name = "investment_amount")
    private double investmentAmount; //Yatırım miktarı
    @Column(name = "additional_notes")
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
