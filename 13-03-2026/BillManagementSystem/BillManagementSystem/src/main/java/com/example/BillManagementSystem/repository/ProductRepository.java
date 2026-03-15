package com.example.BillManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BillManagementSystem.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
