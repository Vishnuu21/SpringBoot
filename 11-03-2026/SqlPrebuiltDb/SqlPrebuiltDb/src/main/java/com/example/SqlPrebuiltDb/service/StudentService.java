package com.example.SqlPrebuiltDb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SqlPrebuiltDb.dto.request.StudentRequest;
import com.example.SqlPrebuiltDb.dto.response.StudentResponse;
import com.example.SqlPrebuiltDb.entity.Student;
import com.example.SqlPrebuiltDb.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentResponse calculationToStudentResponse(StudentRequest req) {
        // .stream() :- passes list or array data (or in gereral collection) of data 1
        // - by 1
        // and stream works like for loop , instead of using for we use stream(),
        // because stream() saves memory in large datasets
        //
        // mapToInt() used to convert the integer to int etcc.....
        //
        // (Integer::intValue) , here Integer is an object and its a non premitive and
        // we
        // cant perform operations like sum(),count() etc on Integer object so we are
        // converting it to in using intValue()
        //
        // :: works as a function , basically we are assigining every element of Integer
        // object to int
        // initially we camn write a funcvtion like normal function{} etc, but here we
        // need that function only for this purpose so we use like this (m->m) watch gpt
        // link sir sent
        int total = req.getMarks().stream().mapToInt(Integer::intValue).sum();
        int subjects = req.getMarks().size();
        double percentage = (double) total / subjects;
        String result = percentage >= 35 ? "PASS" : "FAIL";

        Student student = new Student();
        student.setName(req.getName());
        student.setRollNumber(req.getRollNumber());
        student.setTotal(total);
        student.setPercentage(percentage);
        student.setResult(result);

        studentRepository.save(student);

        return new StudentResponse(req.getName(), result, req.getRollNumber(), total, percentage);
    }

    public List<StudentResponse> GetMultipleStudents() {
        return studentRepository.findAll().stream().map(student -> new StudentResponse(student.getName(),
                student.getResult(), student.getRollNumber(), student.getTotal(), student.getPercentage())).toList();
    }
}
