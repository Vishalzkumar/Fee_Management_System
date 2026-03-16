# Fee Management System

A simple console-based fee management system for college, built in Java.

## Features

- Add students
- Add fees for students (tuition, hostel, etc.)
- Record payments
- View student details including balance

## How to Run

### Option 1: Using VS Code Tasks

1. Compile the project using the "compile" task in VS Code.
2. Run the application using the "run" task.

### Option 2: Using Batch Files (Windows)

1. Double-click `compile.bat` to compile the project.
2. Double-click `run.bat` to run the application.

### Option 3: Manual Commands

1. Compile: `javac -d target/classes src/main/java/com/college/feemanagement/*.java`
2. Run: `java -cp target/classes com.college.feemanagement.Main`

## Project Structure

- `src/main/java/com/college/feemanagement/` - Source code
  - `Student.java` - Student model
  - `Fee.java` - Fee model
  - `Payment.java` - Payment model
  - `FeeManager.java` - Business logic
  - `Main.java` - Console interface

- `pom.xml` - Maven configuration (optional, for future Maven setup)

## Requirements

- Java 11 or higher
