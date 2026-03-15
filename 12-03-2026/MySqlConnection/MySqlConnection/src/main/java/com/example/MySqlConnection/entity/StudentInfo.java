package com.example.MySqlConnection.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class StudentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    private long studentId;

    @Column(name = "studentName")
    private String studentName;

    @OneToOne
    @JoinColumn(name = "registerId")
    private RegisterNumber registerNumber;

   
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public RegisterNumber getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(RegisterNumber registerNumber) {
        this.registerNumber = registerNumber;
    }

}
