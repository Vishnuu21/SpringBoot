package com.example.SqlPrebuiltDb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SqlPrebuiltDb.dto.request.StudentRequest;
import com.example.SqlPrebuiltDb.dto.response.ApiStudentResponse;
import com.example.SqlPrebuiltDb.dto.response.StudentResponse;
import com.example.SqlPrebuiltDb.service.StudentService;

@RestController
@RequestMapping("/studentdb")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/result")
    public ApiStudentResponse<StudentResponse> Getresults(@RequestBody StudentRequest req) {

        StudentResponse result = studentService.calculationToStudentResponse(req);

        return new ApiStudentResponse<StudentResponse>("Success", result);
    }

    @GetMapping("/allresult")
    public ApiStudentResponse<List<StudentResponse>> GetMultipleStudents() {
        List<StudentResponse> results = studentService.GetMultipleStudents();
        return new ApiStudentResponse<List<StudentResponse>>("success", results);
    }

}
