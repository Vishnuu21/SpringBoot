package com.example.Calculation.dto.request;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AdditionRequest {

    @NotNull(message = "Enter 1st Number")
    private double firstNumber;
    @NotNull(message = "Enter 2st Number")
    private double secondnumber;
}
