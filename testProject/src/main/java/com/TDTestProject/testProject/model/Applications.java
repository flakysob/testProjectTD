package com.TDTestProject.testProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "applications")
public class Applications {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 36)
    private String id;

    @NotBlank
    @Column(name = "full_name", nullable = false, length = 100)
    private String full_name;

    @Column(name = "tc_identity_number", length = 20)
    private String tc_identity_number;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "phone_number", length = 20)
    private String phone_number;

    @Column(name = "email", length = 100)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birth_date;

    @Column(name = "has_retail_experience")
    private boolean has_retail_experience;

    @Column(name = "reason_for_choosing_lokumcu_baba", length = 255)
    private String reason_for_choosing_lokumcu_baba;

    @Column(name = "location", length = 100)
    private String location;

    @Column(name = "investment_amount", precision = 10, scale = 2)
    private BigDecimal investment_amount;

    @Column(name = "additional_notes", length = 255)
    private String additional_notes;


    public Applications(
            @JsonProperty("id")
            String id,
            @JsonProperty("full_name")
            String full_name,
            @JsonProperty("tc_identity_number")
            String tc_identity_number,
            @JsonProperty("address")
            String address,
            @JsonProperty("phone_number")
            String phone_number,
            @JsonProperty("email")
            String email,
            @JsonProperty("birth_date")
            Date birth_date,
            @JsonProperty("has_retail_experience")
            boolean has_retail_experience,
            @JsonProperty("reason_for_choosing_lokumcu_baba")
            String reason_for_choosing_lokumcu_baba,
            @JsonProperty("location")
            String location,
            @JsonProperty("investment_amount")
            BigDecimal investment_amount,
            @JsonProperty("additional_notes")
            String additional_notes
    ) {
        this.id = id;
        this.full_name = full_name;
        this.tc_identity_number = tc_identity_number;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        this.birth_date = birth_date;
        this.has_retail_experience = has_retail_experience;
        this.reason_for_choosing_lokumcu_baba = reason_for_choosing_lokumcu_baba;
        this.location = location;
        this.investment_amount = investment_amount;
        this.additional_notes = additional_notes;
    }

    public Applications() {
        // Boş kurucu yöntem
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return full_name;
    }

    public void setFullName(String fullName) {
        this.full_name = fullName;
    }

    public String getTcIdentityNumber() {
        return tc_identity_number;
    }

    public void setTcIdentityNumber(String tcIdentityNumber) {
        this.tc_identity_number = tcIdentityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(Date birthDate) {
        this.birth_date = birthDate;
    }

    public boolean isHasRetailExperience() {
        return has_retail_experience;
    }

    public void setHasRetailExperience(boolean hasRetailExperience) {
        this.has_retail_experience = hasRetailExperience;
    }

    public String getReasonForChoosingLokumcuBaba() {
        return reason_for_choosing_lokumcu_baba;
    }

    public void setReasonForChoosingLokumcuBaba(String reasonForChoosingLokumcuBaba) {
        this.reason_for_choosing_lokumcu_baba = reasonForChoosingLokumcuBaba;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getInvestmentAmount() {
        return investment_amount;
    }

    public void setInvestmentAmount(BigDecimal investmentAmount) {
        this.investment_amount = investmentAmount;
    }

    public String getAdditionalNotes() {
        return additional_notes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additional_notes = additionalNotes;
    }
}
