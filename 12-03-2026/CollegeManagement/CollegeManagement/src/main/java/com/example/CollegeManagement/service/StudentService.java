package com.example.CollegeManagement.service;

import org.springframework.stereotype.Service;

import com.example.CollegeManagement.repository.TeacherRepository;
import com.example.CollegeManagement.dto.request.StudentRequest;
import com.example.CollegeManagement.dto.response.StudentResponse;
import com.example.CollegeManagement.entity.AssignStudentRegisterNo;
import com.example.CollegeManagement.entity.StudentEntity;
import com.example.CollegeManagement.entity.TeacherEntity;
import com.example.CollegeManagement.repository.AssignStudentRegisterNoRepository;
import com.example.CollegeManagement.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final AssignStudentRegisterNoRepository assignStudentRegisterNoRepository;
    private final TeacherRepository teacherRepository;

    public StudentService(StudentRepository studentRepository,
            AssignStudentRegisterNoRepository assignStudentRegisterNoRepository,
            TeacherRepository teacherRepository) {
        this.studentRepository = studentRepository;
        this.assignStudentRegisterNoRepository = assignStudentRegisterNoRepository;
        this.teacherRepository = teacherRepository;
    }

    public StudentResponse assignTeacher(long studentId, long teacherId) {
        StudentEntity student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        TeacherEntity teacher = teacherRepository.findById(teacherId)
                .orElseThrow(() -> new RuntimeException("Teacher Not Found"));

        student.setTeacherId(teacher);
        studentRepository.save(student);

        return new StudentResponse(
                student.getStudentId(),
                student.getStudentName(),
                student.getStudentRegisterNo() != null
                        ? student.getStudentRegisterNo().getStudentRegisterNo()
                        : null,
                student.getStudentCourse(),
                student.getTeacherId().getTeacherId());
    }

    public StudentResponse getStudentResponses(StudentRequest request) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentName(request.getStudentName());
        studentEntity.setStudentCourse(request.getStudentCourse());

        StudentEntity saved = studentRepository.save(studentEntity);

        return new StudentResponse(
                saved.getStudentId(),
                saved.getStudentName(),
                null,
                saved.getStudentCourse(),
                0);
    }

    public StudentResponse assignRegisterNo(long studentId, String registerNo) {
        StudentEntity student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        AssignStudentRegisterNo assignment = new AssignStudentRegisterNo();
        assignment.setStudentRegisterNo(registerNo);

        AssignStudentRegisterNo saved = assignStudentRegisterNoRepository.save(assignment);
        student.setStudentRegisterNo(saved);
        studentRepository.save(student);

        return new StudentResponse(
                student.getStudentId(),
                student.getStudentName(),
                student.getStudentRegisterNo().getStudentRegisterNo(),
                student.getStudentCourse(),
                0);
    }
}