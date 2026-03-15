package com.example.CollegeManagement.service;

import org.springframework.stereotype.Service;

import com.example.CollegeManagement.dto.request.CollegeManagementRequest;
import com.example.CollegeManagement.entity.CollegeManagement;
import com.example.CollegeManagement.repository.CollegeManagementRepository;

@Service
public class CollegeManagementService {
    private final CollegeManagementRepository repository;

    public CollegeManagementService(CollegeManagementRepository repository) {
        this.repository = repository;
    }

    public CollegeManagement addCollege(CollegeManagementRequest request) {

    CollegeManagement college = new CollegeManagement();
    college.setStudentRegisterNo(request.getRegisterNo());
    college.setDepartment(request.getDepartment());

    return repository.save(college);
}
}
