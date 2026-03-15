package com.example.GroceryBillManagement.dto.response;

import lombok.Data;

@Data
public class ProductResponse {
    private Long id;
    private String prodName;
    private Integer prodQty;
    private Double prodMrp;
    private Double prodTax;
}

