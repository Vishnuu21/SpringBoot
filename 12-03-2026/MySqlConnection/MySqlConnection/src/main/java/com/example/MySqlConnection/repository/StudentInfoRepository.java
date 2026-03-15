package com.example.MySqlConnection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MySqlConnection.entity.StudentInfo;

public interface StudentInfoRepository extends JpaRepository<StudentInfo , Long>{

    
}
