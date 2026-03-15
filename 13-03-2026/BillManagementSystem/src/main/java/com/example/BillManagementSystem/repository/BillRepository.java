package com.example.BillManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BillManagementSystem.entity.BillsEntity;



public interface BillRepository extends JpaRepository<BillsEntity, Long> {
    
    List<BillsEntity> findByUserId(Long userId);
    // select * from bills where user_id=? i think it searches by user id in db
}

