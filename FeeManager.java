package com.college.feemanagement;

import java.util.*;

public class FeeManager {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, List<Fee>> fees = new HashMap<>();
    private Map<String, List<Payment>> payments = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
        fees.put(student.getId(), new ArrayList<>());
        payments.put(student.getId(), new ArrayList<>());
    }

    public void addFee(Fee fee) {
        if (students.containsKey(fee.getStudentId())) {
            fees.get(fee.getStudentId()).add(fee);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void makePayment(Payment payment) {
        if (students.containsKey(payment.getStudentId())) {
            payments.get(payment.getStudentId()).add(payment);
        } else {
            System.out.println("Student not found.");
        }
    }

    public double getTotalFees(String studentId) {
        if (!fees.containsKey(studentId)) return 0;
        return fees.get(studentId).stream().mapToDouble(Fee::getAmount).sum();
    }

    public double getTotalPayments(String studentId) {
        if (!payments.containsKey(studentId)) return 0;
        return payments.get(studentId).stream().mapToDouble(Payment::getAmount).sum();
    }

    public double getBalance(String studentId) {
        return getTotalFees(studentId) - getTotalPayments(studentId);
    }

    public void printStudentDetails(String studentId) {
        Student student = students.get(studentId);
        if (student != null) {
            System.out.println("Student: " + student);
            System.out.println("Total Fees: " + getTotalFees(studentId));
            System.out.println("Total Payments: " + getTotalPayments(studentId));
            System.out.println("Balance: " + getBalance(studentId));
        } else {
            System.out.println("Student not found.");
        }
    }

    public void printAllStudents() {
        for (Student student : students.values()) {
            printStudentDetails(student.getId());
            System.out.println("---");
        }
    }
}