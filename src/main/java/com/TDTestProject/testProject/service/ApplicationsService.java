package com.TDTestProject.testProject.service;

import com.TDTestProject.testProject.dao.ApplicationsDAO;
import com.TDTestProject.testProject.model.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ApplicationsService {

    private final ApplicationsDAO applicationsDAO;

    @Autowired
    public ApplicationsService(@Qualifier("MySQL") ApplicationsDAO applicationsDAO) {
        this.applicationsDAO = applicationsDAO;
    }

    public int addApplications(Applications applications){
        return applicationsDAO.insertApplication(applications,applications.getTcIdentityNumber());
    }

    public List<Applications> getAllApplications(){
        return applicationsDAO.SelectAllApplications();
    }

    public Optional<Applications> getApplicationsById(UUID id){
        return applicationsDAO.SelectApplicationById(id);
    }

    public int deleteApplication(UUID id){
        return applicationsDAO.deleteApplicationById(id);
    }

    public int updateApplication(UUID id, Applications newApplications){
        return applicationsDAO.updateApplicationById(id, newApplications);
    }
}
