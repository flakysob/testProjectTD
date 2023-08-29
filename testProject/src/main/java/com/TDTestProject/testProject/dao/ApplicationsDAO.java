package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.Applications;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ApplicationsDAO {

    int insert(
            String id,
            String fullName,
            String tcIdentityNumber,
            String address,
            String phoneNumber,
            String email,
            Date birthDate,
            boolean hasRetailExperience,
            String reasonForChoosingLokumcuBaba,
            String location,
            BigDecimal investmentAmount,
            String additionalNotes
    );
    default int insert(Applications applications){

        return insert(
                applications.getId(),
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
    Optional<Applications> SelectApplicationById(String id);

    int deleteApplicationById(String id);
    int updateApplicationById(String id, Applications applications);


}
