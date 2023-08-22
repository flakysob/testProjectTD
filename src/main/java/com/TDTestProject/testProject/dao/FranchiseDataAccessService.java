package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.FranchiseInformation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("FraDAO")
public class FranchiseDataAccessService implements FranchiseDAO{
    private static List<FranchiseInformation> DB = new ArrayList<>();
    @Override
    public int insertFranchise(UUID id, String franchiseName, String location) {
        return 1;
    }
}
