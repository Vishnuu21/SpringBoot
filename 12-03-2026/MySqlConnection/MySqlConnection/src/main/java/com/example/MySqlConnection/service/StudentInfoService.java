package com.example.MySqlConnection.service;

import org.springframework.stereotype.Service;

import com.example.MySqlConnection.dto.request.StudentInfoRequest;
import com.example.MySqlConnection.dto.response.StudentInfoResponse;
import com.example.MySqlConnection.entity.RegisterNumber;
import com.example.MySqlConnection.entity.StudentInfo;
import com.example.MySqlConnection.repository.RegisterNumberRepository;
import com.example.MySqlConnection.repository.StudentInfoRepository;

@Service
public class StudentInfoService {
    private final StudentInfoRepository studentInfoRepository;
    private final RegisterNumberRepository registerNumberRepository;

    public StudentInfoService(StudentInfoRepository studentInfoRepository,
            RegisterNumberRepository registerNumberRepository) {
        this.studentInfoRepository = studentInfoRepository;
        this.registerNumberRepository = registerNumberRepository;
    }

    public StudentInfoResponse getStudentInformation(StudentInfoRequest req) {
        StudentInfo student = new StudentInfo();
        student.setStudentName(req.getName());
        StudentInfo information = studentInfoRepository.save(student);
        return new StudentInfoResponse(information.getStudentId(), information.getStudentName(), null);
    }

    public StudentInfoResponse assignRegisterNumber(long studentId, String regNumber) {
        StudentInfo student = studentInfoRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        RegisterNumber register = new RegisterNumber();
        register.setRegnumber(regNumber);

        RegisterNumber savedRegister = registerNumberRepository.save(register);
        student.setRegisterNumber(savedRegister);

        studentInfoRepository.save(student);

        return new StudentInfoResponse(student.getStudentId(), student.getStudentName(),
                student.getRegisterNumber().getRegnumber());
    }
}
