package com.example.PriceAndNet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PriceAndNet.dto.request.PriceAndNetRequest;
import com.example.PriceAndNet.dto.response.ApiResponse;
import com.example.PriceAndNet.dto.response.PriceAndNetResponse;
import com.example.PriceAndNet.service.PriceAndNetService;

@RestController
@RequestMapping("/buyProduct")
public class PriceAndNetController {
    private final PriceAndNetService priceAndNetService;

    public PriceAndNetController(PriceAndNetService priceAndNetService){
        this.priceAndNetService = priceAndNetService;
    }   

    @PostMapping("/result")
    public ApiResponse getResult(@RequestBody PriceAndNetRequest req){
        PriceAndNetResponse netTotal = priceAndNetService.calculateCustomersResponse(req);
        return new ApiResponse("success", netTotal);
    }
}
