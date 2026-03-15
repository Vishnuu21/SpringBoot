package com.example.MySqlConnection.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MySqlConnection.dto.request.RegisterNumberRequest;
import com.example.MySqlConnection.dto.request.StudentInfoRequest;
import com.example.MySqlConnection.dto.response.StudentInfoApiResponse;
import com.example.MySqlConnection.dto.response.StudentInfoResponse;
import com.example.MySqlConnection.service.StudentInfoService;

@RestController
@RequestMapping("/student")
public class StudentInfoController {
    private final StudentInfoService studentInfoService;

    public StudentInfoController(StudentInfoService studentInfoService) {
        this.studentInfoService = studentInfoService;
    }

    @PostMapping("/add")
    public StudentInfoApiResponse<StudentInfoResponse> createStudent(@RequestBody StudentInfoRequest req) {
        StudentInfoResponse studentInfoResponse = studentInfoService.getStudentInformation(req);
        return new StudentInfoApiResponse<StudentInfoResponse>("success", studentInfoResponse);
    }

    @PostMapping("/{id}/register")
    public StudentInfoApiResponse<StudentInfoResponse> assignRegister(@PathVariable long id,
            @RequestBody RegisterNumberRequest registerNumber) {
        StudentInfoResponse response = studentInfoService.assignRegisterNumber(id, registerNumber.getRegisterNumber());
        return new StudentInfoApiResponse<StudentInfoResponse>("success", response);
    }
}
