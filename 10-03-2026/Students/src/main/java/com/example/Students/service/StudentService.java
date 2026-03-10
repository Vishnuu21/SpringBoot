package com.example.Students.service;

import org.springframework.stereotype.Service;

import com.example.Students.dto.request.StudentRequest;
import com.example.Students.dto.response.StudentResponse;

@Service // telling that its a service class
public class StudentService {
    public StudentResponse calStudentResponse(StudentRequest req) {
        int total = 0;
        total = req.getM1() + req.getM2() + req.getM3() + req.getM4() + req.getM5();
        double percentage = total / 5.0;
        String result = percentage > 35 ? "PASS" : "FAIL";

        return new StudentResponse(req.getName(), result, req.getRollNo(), total, percentage);
    }
}
