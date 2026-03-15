package com.example.GroceryBillManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GroceryBillManagement.entity.BillItemEntity;

public interface BillItemRepository extends JpaRepository<BillItemEntity, Long> {
    List<BillItemEntity> findByBillId(Long billId);
}
