package com.example.SqlPrebuiltDb.dto.response;

public class StudentResponse {
    private String name, result;
    private int rollNumber, totalMarks;
    private double percentage;

    public StudentResponse(String name, String result, int rollNumber, int totalMarks, double percentage) {
        this.name = name;
        this.result = result;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
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

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

}
