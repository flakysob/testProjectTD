package com.TDTestProject.testProject.service;

import com.TDTestProject.testProject.dao.FranchiseDAO;
import com.TDTestProject.testProject.model.FranchiseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FranchiseService {
    private final FranchiseDAO franchiseDAO;

    @Autowired
    public FranchiseService(@Qualifier("FraDAO") FranchiseDAO franchiseDAO) {
        this.franchiseDAO = franchiseDAO;
    }

    public int addFranchise(FranchiseInformation franchiseInformation){
        return franchiseDAO.insertFranchise(franchiseInformation.getFranchiseName(),franchiseInformation.getLocation());


    }
}
