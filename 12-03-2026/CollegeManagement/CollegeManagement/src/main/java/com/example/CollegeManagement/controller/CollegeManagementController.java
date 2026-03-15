package com.example.CollegeManagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CollegeManagement.dto.request.CollegeManagementRequest;
import com.example.CollegeManagement.entity.CollegeManagement;
import com.example.CollegeManagement.service.CollegeManagementService;

@RestController
@RequestMapping("/management")
public class CollegeManagementController {
     private final CollegeManagementService service;

    public CollegeManagementController(CollegeManagementService service) {
        this.service = service;
    }

   @PostMapping("/college")
public CollegeManagement addCollege(@RequestBody CollegeManagementRequest request) {
    return service.addCollege(request);
}
}
