// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

// Hint => 
// Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks


import java.util.Scanner;

public class GradeCalculate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take marks input for PCM
        System.out.print("Enter marks for Physics Chemistry Maths ");

        int physicsMarks = input.nextInt();
        int chemistryMarks = input.nextInt();
        int mathsMarks = input.nextInt();

        // Calculate the total marks obtained 
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        int totalSubjects = 3; 

        // Calculate the percentage
        double percentage = (double) totalMarks / (totalSubjects * 100) * 100;

        // Determine the grade 
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Leve 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Leve 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Leve 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Leve 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Leve 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the results
        System.out.println("Total Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the scanner
        input.close();
    }
}

