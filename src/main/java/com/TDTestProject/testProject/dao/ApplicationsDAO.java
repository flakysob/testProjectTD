package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.Applications;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface ApplicationsDAO {

    int insertApplication(UUID id, String fullName, String tcIdentityNumber);
    default int insertApplication(Applications applications, String tcIdentityNumber){
        UUID id = UUID.randomUUID();
        return insertApplication(id, applications.getFullName(),applications.getTcIdentityNumber());
    }

    List<Applications> SelectAllApplications();


}
