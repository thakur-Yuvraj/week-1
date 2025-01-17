// Program to Simulate Student Report
// Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
// To calculate the grade based on the marks.
// To display the student's details and grade.
// Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information.

import java.util.*;


// Create a Student class with attributes name, rollNumber, and marks. And two methods
class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;
    private String grade = null;

    // constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    // Methods are used to calculate the grade and provide a way to display all information.
    // To calculate the grade based on the marks.
    public void gradeCalculate() {
        // calculating the grade
        if (marks >= 90) {
            grade = "A+";
        }
        else if (marks >= 80) {
            grade = "A";
        }
        else if (marks >= 70) {
            grade = "B+";
        }
        else if (marks >= 60) {
            grade = "B";
        }
        else if (marks >= 50) {
            grade = "C+";
        }
        else if (marks >= 40) {
            grade = "C";
        }
        else if (marks >= 30) {
            grade = "F";
        }
    }
    // method to get grades
    String getGrade() {
        return grade;
    }
    // To display the student's details and grade.
    public void display() {
        System.out.println("Name of student is :"+ name + " and rollnumber is :"+ rollNumber +" \nMarks are :"+ marks+ " Grade is :"+ getGrade() );
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating a student object and passing parameter
        Student student1 = new Student("Shivam", 123, 77);

        // invoking the grade calculate method
        student1.gradeCalculate();

        // printing the output by calling display method
        student1.display();

        sc.close();
    }
}