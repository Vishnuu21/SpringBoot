package com.example.BillManagementSystem.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.BillManagementSystem.dto.request.BillRequest;
import com.example.BillManagementSystem.dto.response.BillResponse;
import com.example.BillManagementSystem.entity.BillsEntity;
import com.example.BillManagementSystem.entity.UserEntity;
import com.example.BillManagementSystem.repository.BillRepository;
import com.example.BillManagementSystem.repository.UserRepository;

@Service
public class BillService {
    private final BillRepository billRepository;
    private final UserRepository userRepository;

    public BillService(BillRepository billRepository, UserRepository userRepository) {
        this.billRepository = billRepository;
        this.userRepository = userRepository;
    }

    public BillResponse createBill(BillRequest request) {
        UserEntity userEntity = userRepository.findById(request.getUserId()).orElseThrow();

        BillsEntity billsEntity = new BillsEntity();
        billsEntity.setUser(userEntity);

        BillsEntity savedBill = billRepository.save(billsEntity);

        BillResponse responses = new BillResponse();
        responses.setId(savedBill.getId());
        responses.setUserId(userEntity.getId()); 

        return responses;
    }

    public List<BillResponse> getBillsByUser(Long userId) {
        List<BillsEntity> billsEntities = billRepository.findByUserId(userId);

        return billsEntities.stream().map(
                bill -> {
                    BillResponse res = new BillResponse();
                    res.setId(bill.getId());
                    res.setUserId(bill.getUser().getId());
                    return res;
                }).collect(Collectors.toList());
    }
}
