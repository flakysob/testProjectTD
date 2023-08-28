package com.TDTestProject.testProject.api;

import com.TDTestProject.testProject.model.Applications;
import com.TDTestProject.testProject.service.ApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/applications")
@RestController
public class ApplicationController {
    private final ApplicationsService applicationsService;

    @Autowired
    public ApplicationController(ApplicationsService applicationsService) {
        this.applicationsService = applicationsService;
    }

    @PostMapping
    public void addApplications(@Valid @NotNull @RequestBody Applications applications){
        applicationsService.addApplications(applications);
    }

    @GetMapping
    public List<Applications> getAllApplications(){
        return applicationsService.getAllApplications();
    }

    @GetMapping(path = "{id}")
    public Applications getApplicationById(@PathVariable("id") UUID id){
        return applicationsService.getApplicationsById(id).orElse(null); //Normalde orElse için özelleştirilmiş geri dönüş değeri (bulunamadı mesajı veya exception) döndürülür. Bu şartlar altında herhangi UUID formatına uygun veri verilirse boş bir değer döner.
    }

    @DeleteMapping(path = "{id}")
    public void deleteApplicationById(@PathVariable("id") UUID id){
        applicationsService.deleteApplication(id);
    }

    @PutMapping(path = "{id}")
    public void updateApplications(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Applications applicationToUpdate){
        applicationsService.updateApplication(id, applicationToUpdate);
    }
}
