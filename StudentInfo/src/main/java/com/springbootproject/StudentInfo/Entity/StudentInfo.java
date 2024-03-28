package com.springbootproject.StudentInfo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Student_Information")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Roll_Number")
    private int studentRollNo;
    @Column(name="Student_Name")
    private String studentName;
    @Column(name="Address")
    private String studentAddress;
    @Column(name="Email_ID")
    private String studentEmail;
    @Column(name="Phone_No")
    private String studentPhoneNo;
    @Column(name="Gender")
    private String studentGender;
    @Column(name="DOB")
    private String studentDOB;

    public StudentInfo() {

    }

    public StudentInfo(int studentRollNo, String studentName, String studentAddress, String studentEmail, String studentPhoneNo, String studentGender, String studentDOB) {
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentPhoneNo = studentPhoneNo;
        this.studentGender = studentGender;
        this.studentDOB = studentDOB;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhoneNo() {
        return studentPhoneNo;
    }

    public void setStudentPhoneNo(String studentPhoneNo) {
        this.studentPhoneNo = studentPhoneNo;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentRollNo=" + studentRollNo +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentPhoneNo='" + studentPhoneNo + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", studentDOB='" + studentDOB + '\'' +
                '}';
    }
}
