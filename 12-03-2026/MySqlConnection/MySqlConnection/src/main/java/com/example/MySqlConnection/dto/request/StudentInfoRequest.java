package com.example.MySqlConnection.dto.request;

public class StudentInfoRequest {
    
    private String name;

    public StudentInfoRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
