package com.example.Students.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Students.dto.request.StudentRequest;
import com.example.Students.dto.response.ApiResponse;
import com.example.Students.dto.response.StudentResponse;
import com.example.Students.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @PostMapping("/calculation")
    public ApiResponse getResult(@RequestBody StudentRequest request){
        StudentResponse result = studentService.calStudentResponse(request);
        return new ApiResponse("success", result);
    }
}
