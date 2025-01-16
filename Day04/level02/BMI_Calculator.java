import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI using the formula BMI = weight / (height * height) where height is in meters
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        // Calculate BMI
        return weight / (height * height);
    }

    // Method to determine BMI status based on the calculated BMI
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array to store weight (kg), height (cm), and BMI for 10 persons
        double[][] data = new double[10][3]; 
        // 10 rows (persons), 3 columns (weight, height, BMI)
        String[] bmiStatus = new String[10];
         // To store the BMI status for each person

        // Take input for 10 persons (weight and height)
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            double weight = input.nextDouble();

            System.out.print("Enter height (cm): ");
            double height = input.nextDouble();

            // Store weight and height in the data array
            data[i][0] = weight;
            data[i][1] = height;

            // Calculate BMI and store it in the third column
            double bmi = calculateBMI(weight, height);
            data[i][2] = bmi;

            // Determine BMI status
            bmiStatus[i] = getBMIStatus(bmi);
        }

        // Display the BMI details and status for each person

        for (int i = 0; i < 10; i++) {
            System.out.println("person "+ (i + 1) + " weight is :"+  data[i][0]+ " Height is : "+ data[i][1] +" BMI is : "+ data[i][2]+ "  Status of BMI :"  + bmiStatus[i]);
        }

        
        input.close();
    }
}
