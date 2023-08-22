package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.FranchiseInformation;

import java.util.UUID;

public interface FranchiseDAO {
    int insertFranchise(UUID id, String franchiseName, String location);
    default int insertFranchise(String franchiseName, String location){
        UUID id = UUID.randomUUID();
        return insertFranchise(id, franchiseName, location);
    }
}
