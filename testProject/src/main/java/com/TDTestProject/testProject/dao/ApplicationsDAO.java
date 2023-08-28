package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.Applications;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ApplicationsDAO {

    int insertApplication(
            UUID id,
            String fullName,
            String tcIdentityNumber,
            String address,
            String phoneNumber,
            String email,
            String birthDate,
            boolean hasRetailExperience,
            String reasonForChoosingLokumcuBaba,
            String location,
            double investmentAmount,
            String additionalNotes
    );
    default int insertApplication(Applications applications, String tcIdentityNumber){
        UUID id = UUID.randomUUID();
        return insertApplication(id,
                applications.getFullName(),
                applications.getTcIdentityNumber(),
                applications.getAddress(),
                applications.getPhoneNumber(),
                applications.getEmail(),
                applications.getBirthDate(),
                applications.isHasRetailExperience(),
                applications.getReasonForChoosingLokumcuBaba(),
                applications.getLocation(),
                applications.getInvestmentAmount(),
                applications.getAdditionalNotes()
                );
    }

    List<Applications> SelectAllApplications();
    Optional<Applications> SelectApplicationById(UUID id);

    int deleteApplicationById(UUID id);
    int updateApplicationById(UUID id, Applications applications);


}
