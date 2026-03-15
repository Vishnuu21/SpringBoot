package com.example.CollegeManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "assign_student_register_no")
public class AssignStudentRegisterNo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long registerId;

    @Column(name = "RegisterNo")
    private String studentRegisterNo;

    public long getRegisterId() {
        return registerId;
    }

    public void setRegisterId(long registerId) {
        this.registerId = registerId;
    }

    public String getStudentRegisterNo() {
        return studentRegisterNo;
    }

    public void setStudentRegisterNo(String studentRegisterNo) {
        this.studentRegisterNo = studentRegisterNo;
    }
}