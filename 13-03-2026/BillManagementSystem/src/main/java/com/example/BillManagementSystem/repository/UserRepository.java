package com.example.BillManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BillManagementSystem.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
