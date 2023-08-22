package com.TDTestProject.testProject.api;

import com.TDTestProject.testProject.model.Applications;
import com.TDTestProject.testProject.service.ApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/applications")
@RestController
public class ApplicationController {
    private final ApplicationsService applicationsService;

    @Autowired
    public ApplicationController(ApplicationsService applicationsService) {
        this.applicationsService = applicationsService;
    }

    @PostMapping
    public void addApplications(@RequestBody Applications applications){
        applicationsService.addApplications(applications);
    }
}
