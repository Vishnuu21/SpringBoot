package com.example.GroceryBillManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GroceryBillManagement.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}