package com.college.feemanagement;

import java.util.Date;

public class Payment {
    private String studentId;
    private double amount;
    private Date paymentDate;

    public Payment(String studentId, double amount, Date paymentDate) {
        this.studentId = studentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
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

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "studentId='" + studentId + '\'' +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                '}';
    }
}