// An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
// Create a Method to find the BMI and status of every person given the person height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Create a Method that takes the 2D array of height and weight as parameter. Calls the  user defined method to compute the BMI and the BMI Status and store in 2D String array of height, weight, BMI, and status.
// Create a method to display the 2D string array in a tabular format of Person Height, Weight, BMI and the Status
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.


import java.util.Scanner;

public class BMICalculation {
    // Method to compute BMI and status based on weight and height
    public static String[][] calculateBMI(double[][] weightHeight) {
        String[][] bmiResults = new String[weightHeight.length][4];

        for (int i = 0; i < weightHeight.length; i++) {
            double weight = weightHeight[i][0];
			// Convert cm to meters
            double heightInMeters = weightHeight[i][1] / 100; 
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = determineStatus(bmi);
            
            bmiResults[i][0] = String.valueOf(weightHeight[i][1]); // Height
            bmiResults[i][1] = String.valueOf(weight); // Weight
            bmiResults[i][2] = String.format("%.2f", bmi); // BMI
            bmiResults[i][3] = status; // Status
        }
        return bmiResults;
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Under weight";
        } else if (bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Person   \t"+"Height(cm) "+"Weight(kg) "+"BMI \t"+"Status \t");
        System.out.println("----------------------------------------------------------");
		for(int i=0; i<results.length; i++) {
			System.out.println("Person "+(i+1)+"\t"+results[i][0]+"\t"+results[i][1]+"   \t     "+results[i][2]+"  \t"+results[i][3]+"    \t");
		}
       
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] weightHeight = new double[10][2]; // Array to store weight and height

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weightHeight[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            weightHeight[i][1] = input.nextDouble();
        }
		System.out.println("");     //For new line
        // Calculate BMI and statuses
        String[][] bmiResults = calculateBMI(weightHeight);

        // Display the results
        displayResults(bmiResults);
		
		input.close();
    }
}



