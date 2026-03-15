package com.example.MySqlConnection.dto.request;

public class RegisterNumberRequest {
    private String registerNumber;

    public RegisterNumberRequest(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    
}
