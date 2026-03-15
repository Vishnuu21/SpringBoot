package com.example.BillManagementSystem.service;

import org.springframework.stereotype.Service;

import com.example.BillManagementSystem.dto.request.UserRequest;
import com.example.BillManagementSystem.dto.response.UserResponse;
import com.example.BillManagementSystem.entity.UserEntity;
import com.example.BillManagementSystem.repository.UserRepository;




@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserResponse createUser(UserRequest request){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(request.getName());

        UserEntity savedUser = userRepository.save(userEntity);

        UserResponse response = new UserResponse();
        response.setId(savedUser.getId());
        response.setName(savedUser.getName());

        return response;
    }
}
