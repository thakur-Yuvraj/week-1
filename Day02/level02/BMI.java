// Create a program to find the BMI of a person
// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
// Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Use the table to determine the weight status of the person


import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height in centimeters: ");
        double heightInCm = input.nextDouble();

        // Convert height to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);

        // Output the BMI 
        System.out.println("Your BMI is: " + bmi);
        
        // Check BMI output
        if (bmi <= 18.4) {
            System.out.println("You are underweight");
        } else if (bmi <= 24.9) {
            System.out.println("You have a normal weight");
        } else if (bmi <= 39.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }

        input.close();
    }
}

