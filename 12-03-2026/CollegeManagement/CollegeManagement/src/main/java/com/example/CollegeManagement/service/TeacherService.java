package com.example.CollegeManagement.service;

import org.springframework.stereotype.Service;

import com.example.CollegeManagement.dto.request.TeacherRequest;
import com.example.CollegeManagement.dto.response.TeacherResponse;
import com.example.CollegeManagement.entity.AssignTeacherDepartment;
import com.example.CollegeManagement.entity.TeacherEntity;
import com.example.CollegeManagement.repository.AssignTeacherDepartmentRepository;
import com.example.CollegeManagement.repository.TeacherRepository;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;
    private final AssignTeacherDepartmentRepository assignTeacherDepartmentRepository;

    public TeacherService(TeacherRepository teacherRepository,
            AssignTeacherDepartmentRepository assignTeacherDepartmentRepository) {
        this.teacherRepository = teacherRepository;
        this.assignTeacherDepartmentRepository = assignTeacherDepartmentRepository;
    }

    public TeacherResponse getTeacherResponses(TeacherRequest request) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setTeacherName(request.getTeacherName());
        teacherEntity.setPhoneNo(request.getPhoneNo());
        teacherEntity.setEmail(request.getEmail());

        TeacherEntity saved = teacherRepository.save(teacherEntity);

        return new TeacherResponse(
                saved.getTeacherId(),
                saved.getTeacherName(),
                saved.getPhoneNo(),
                saved.getEmail(),
                null);
    }

    public TeacherResponse assignDepartment(long teacherId, String department) {
        TeacherEntity teacherEntity = teacherRepository.findById(teacherId)
                .orElseThrow(() -> new RuntimeException("Teacher Not Found"));

        AssignTeacherDepartment assignment = new AssignTeacherDepartment();
        assignment.setDepartment(department);

        AssignTeacherDepartment saved = assignTeacherDepartmentRepository.save(assignment);
        teacherEntity.setDepartment(saved);
        teacherRepository.save(teacherEntity);

        return new TeacherResponse(
                teacherEntity.getTeacherId(),
                teacherEntity.getTeacherName(),
                teacherEntity.getPhoneNo(),
                teacherEntity.getEmail(),
                teacherEntity.getDepartment().getDepartment());
    }
}