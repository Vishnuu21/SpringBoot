package com.example.MySqlConnection.dto.response;

public class StudentInfoResponse {

    private long studentId;
    private String studentName;
    private String regnumber;

    public StudentInfoResponse(long studentId, String studentName, String regnumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.regnumber = regnumber;
    }

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

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

}
