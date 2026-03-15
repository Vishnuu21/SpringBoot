package com.example.GroceryBillManagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GroceryBillManagement.dto.Api.ApiResponse;
import com.example.GroceryBillManagement.dto.request.UserRequest;
import com.example.GroceryBillManagement.dto.response.UserResponse;
import com.example.GroceryBillManagement.serice.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ApiResponse<UserResponse> createUser(@RequestBody UserRequest request) {
        UserResponse response = userService.createUser(request);
        return new ApiResponse<UserResponse>("success", response);
    }
}
