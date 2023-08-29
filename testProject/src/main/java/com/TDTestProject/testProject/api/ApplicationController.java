package com.TDTestProject.testProject.api;

import com.TDTestProject.testProject.model.Applications;
import com.TDTestProject.testProject.service.ApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/applications")
@Controller
public class ApplicationController {
    private final ApplicationsService applicationsService;

    @Autowired
    public ApplicationController(ApplicationsService applicationsService) {
        this.applicationsService = applicationsService;
    }

    @PostMapping
    public ResponseEntity<Void> addApplications(@Valid @NotNull @RequestBody Applications applications){
        int result = applicationsService.addApplications(applications);
        if (result == 1) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Applications>> getAllApplications(){
        List<Applications> applications = applicationsService.getAllApplications();
        return ResponseEntity.ok(applications);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Applications> getApplicationById(@PathVariable("id") String id){
        Optional<Applications> application = applicationsService.getApplicationsById(id);
        if (application.isPresent()) {
            return ResponseEntity.ok(application.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteApplicationById(@PathVariable("id") String id){
        int result = applicationsService.deleteApplication(id);
        if (result == 1) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Void> updateApplications(@PathVariable("id") String id, @Valid @NotNull @RequestBody Applications applicationToUpdate) {
        int result = applicationsService.updateApplication(id, applicationToUpdate);
        if (result == 1) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
