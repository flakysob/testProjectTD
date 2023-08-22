package com.TDTestProject.testProject.dao;

import com.TDTestProject.testProject.model.Applications;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("AppDAO")
public class ApplicationsDataAccessService implements ApplicationsDAO{
    private static List<Applications> DB = new ArrayList<>();

    @Override
    public int insertApplication(UUID id, String fullName, String tcIdentityNumber) {
        return 1;
    }
}
