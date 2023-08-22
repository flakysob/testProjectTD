package com.TDTestProject.testProject.api;

import com.TDTestProject.testProject.model.FranchiseInformation;
import com.TDTestProject.testProject.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/franchiseInformation")
@RestController
public class FranchiseController {

    private final FranchiseService franchiseService;

    @Autowired
    public FranchiseController(FranchiseService franchiseService) {
        this.franchiseService = franchiseService;
    }

    @PostMapping
    public void addFranchise(@RequestBody FranchiseInformation franchiseInformation){
        franchiseService.addFranchise(franchiseInformation);
    }
}
