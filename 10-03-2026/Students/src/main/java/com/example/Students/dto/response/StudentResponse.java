package com.example.Students.dto.response;

public class StudentResponse {
    private String name, result;
    private int rollNo, total;
    private double precentage;

    public StudentResponse(String name, String result, int rollNo, int total, double precentage) {
        this.name = name;
        this.result = result;
        this.rollNo = rollNo;
        this.total = total;
        this.precentage = precentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getPrecentage() {
        return precentage;
    }

    public void setPrecentage(double precentage) {
        this.precentage = precentage;
    }

}
