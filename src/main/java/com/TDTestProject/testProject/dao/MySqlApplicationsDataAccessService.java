package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.Applications;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("MySQL")
public class MySqlApplicationsDataAccessService implements ApplicationsDAO{
    @Override
    public int insertApplication(UUID id, String fullName, String tcIdentityNumber, String address, String phoneNumber, String email, String birthDate, boolean hasRetailExperience, String reasonForChoosingLokumcuBaba, String location, double investmentAmount, String additionalNotes) {
        return 0;
    }

    @Override
    public List<Applications> SelectAllApplications() {
        return List.of(new Applications(UUID.randomUUID(), "aaa", "111", "Deneme adres", "0512 123 456 78 99", "deneme@deneme.com","01-01-2000",false,"Deneme sebep", "İstanbul", 100000.200, "Deneme açıklama notu"));
    }

    @Override
    public Optional<Applications> SelectApplicationById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteApplicationById(UUID id) {
        return 0;
    }

    @Override
    public int updateApplicationById(UUID id, Applications applications) {
        return 0;
    }
}
