package com.college.feemanagement;

import java.util.Date;

public class Fee {
    private String studentId;
    private double amount;
    private String type; // e.g., tuition, hostel, exam
    private Date dueDate;

    public Fee(String studentId, double amount, String type, Date dueDate) {
        this.studentId = studentId;
        this.amount = amount;
        this.type = type;
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "studentId='" + studentId + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}