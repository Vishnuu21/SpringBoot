package com.example.PriceAndNet.dto.response;

public class ApiResponse {
    private String status;
    private PriceAndNetResponse data;

    
    public ApiResponse(String status, PriceAndNetResponse data) {
        this.status = status;
        this.data = data;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public PriceAndNetResponse getData() {
        return data;
    }


    public void setData(PriceAndNetResponse data) {
        this.data = data;
    }

    
}
