package com.example.SqlPrebuiltDb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SqlPrebuiltDb.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
 
}