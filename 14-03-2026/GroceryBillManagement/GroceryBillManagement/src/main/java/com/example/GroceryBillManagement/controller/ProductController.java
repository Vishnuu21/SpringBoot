package com.example.GroceryBillManagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GroceryBillManagement.dto.Api.ApiResponse;
import com.example.GroceryBillManagement.dto.request.ProductRequest;
import com.example.GroceryBillManagement.dto.response.ProductResponse;
import com.example.GroceryBillManagement.serice.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @PostMapping
    public ApiResponse<ProductResponse> createProduct(@RequestBody ProductRequest request){
        ProductResponse response = productService.createProduct(request);
        return new ApiResponse<ProductResponse>("success", response);
    }

    @GetMapping
    public ApiResponse<List<ProductResponse>> getAllProducts(){
        List<ProductResponse> responses = productService.getAllProducts();
        return new ApiResponse<List<ProductResponse>>("success", responses);
    }

}

