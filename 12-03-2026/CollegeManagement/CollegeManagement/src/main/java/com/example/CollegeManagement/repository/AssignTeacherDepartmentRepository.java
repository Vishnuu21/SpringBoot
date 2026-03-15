package com.example.CollegeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CollegeManagement.entity.AssignTeacherDepartment;

public interface AssignTeacherDepartmentRepository extends JpaRepository<AssignTeacherDepartment, Long> {
}