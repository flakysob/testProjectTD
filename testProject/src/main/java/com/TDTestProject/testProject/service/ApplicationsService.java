package com.TDTestProject.testProject.service;

import com.TDTestProject.testProject.dao.ApplicationsDAO;
import com.TDTestProject.testProject.model.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ApplicationsService {

    private final ApplicationsDAO applicationsDAO;

    @Autowired
    public ApplicationsService(ApplicationsDAO applicationsDAO) {
        this.applicationsDAO = applicationsDAO;
    }

    public int addApplications(Applications applications){

        return applicationsDAO.insert(
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

    public List<Applications> getAllApplications(){
        return applicationsDAO.SelectAllApplications();
    }

    public Optional<Applications> getApplicationsById(String id){
        return applicationsDAO.SelectApplicationById(id);
    }

    public int deleteApplication(String id){
        return applicationsDAO.deleteApplicationById(id);
    }

    public int updateApplication(String id, Applications newApplications){
        return applicationsDAO.updateApplicationById(id, newApplications);
    }
}
