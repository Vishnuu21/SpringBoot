package com.example.GroceryBillManagement.serice;

import org.springframework.stereotype.Service;

import com.example.GroceryBillManagement.dto.request.UserRequest;
import com.example.GroceryBillManagement.dto.response.UserResponse;
import com.example.GroceryBillManagement.entity.UserEntity;
import com.example.GroceryBillManagement.repository.UserRepository;




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
