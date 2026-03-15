package com.example.CollegeManagement.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CollegeManagement.dto.request.AssignTeacherToStudentRequest;
import com.example.CollegeManagement.dto.request.AssignStudentRegisterNoRequest;
import com.example.CollegeManagement.dto.request.StudentRequest;
import com.example.CollegeManagement.dto.response.StudentApiResponse;
import com.example.CollegeManagement.dto.response.StudentResponse;
import com.example.CollegeManagement.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/result")
    public StudentApiResponse<StudentResponse> addStudent(@RequestBody StudentRequest request) {
        StudentResponse response = studentService.getStudentResponses(request);
        return new StudentApiResponse<>("success", response);
    }

    @PostMapping("/{id}/register")
    public StudentApiResponse<StudentResponse> assignRegisterNo(
            @PathVariable long id,
            @RequestBody AssignStudentRegisterNoRequest request) {
        StudentResponse response = studentService.assignRegisterNo(id, request.getRegisterNo());
        return new StudentApiResponse<>("success", response);
    }

    @PostMapping("/{id}/teacher")
    public StudentApiResponse<StudentResponse> assignTeacher(
            @PathVariable long id,
            @RequestBody AssignTeacherToStudentRequest request) {
        StudentResponse response = studentService.assignTeacher(id, request.getTeacherId());
        return new StudentApiResponse<>("success", response);
    }
}