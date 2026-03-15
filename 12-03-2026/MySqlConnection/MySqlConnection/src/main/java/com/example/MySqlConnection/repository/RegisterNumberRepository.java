package com.example.MySqlConnection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MySqlConnection.entity.RegisterNumber;

public interface RegisterNumberRepository extends JpaRepository<RegisterNumber, Long > {
    
}
