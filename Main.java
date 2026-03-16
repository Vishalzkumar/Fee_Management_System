package com.college.feemanagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static FeeManager feeManager = new FeeManager();
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nFee Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Fee");
            System.out.println("3. Make Payment");
            System.out.println("4. View Student Details");
            System.out.println("5. View All Students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addFee();
                    break;
                case 3:
                    makePayment();
                    break;
                case 4:
                    viewStudentDetails();
                    break;
                case 5:
                    feeManager.printAllStudents();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, course);
        feeManager.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void addFee() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Fee Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Fee Type: ");
        String type = scanner.nextLine();
        System.out.print("Enter Due Date (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();

        try {
            Date dueDate = dateFormat.parse(dateStr);
            Fee fee = new Fee(studentId, amount, type, dueDate);
            feeManager.addFee(fee);
            System.out.println("Fee added successfully.");
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }

    private static void makePayment() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Payment Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Payment Date (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();

        try {
            Date paymentDate = dateFormat.parse(dateStr);
            Payment payment = new Payment(studentId, amount, paymentDate);
            feeManager.makePayment(payment);
            System.out.println("Payment recorded successfully.");
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }

    private static void viewStudentDetails() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        feeManager.printStudentDetails(studentId);
    }
}