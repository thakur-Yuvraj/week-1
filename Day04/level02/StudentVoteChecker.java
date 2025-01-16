// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
// Hint => 
// Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
// Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; else return false;
// In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age, call canStudentVote() and display the result


import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate if the age is a positive number
        if (age < 0) {
            return false; 
        }

        // Check if the student is 18 or older
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker studentVoteChecker = new StudentVoteChecker();

        // Array to store the ages of  students
        int[] ages = new int[10];

        //  take user input for the age of each student
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Loop through the array and check if each student can vote
        for (int i = 0; i < 10; i++) {
            int age = ages[i];
            boolean canVote = studentVoteChecker.canStudentVote(age);

            // Display the result for each student
            if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
            }
        }


        scanner.close();
    }
}
