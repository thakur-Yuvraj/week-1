// Extend or Create a UnitConvertor utility class similar to the
// one shown in the notes to do the following. 
// Please define static methods for all the UnitConvertor class methods. E.g. 
// public static double convertYardsToFeet(double yards) => 
// Method to convert yards to feet and return the value.
// Use following code to convert  double yards2feet = 3;
// Method to convert feet to yards and return the value.
// Use following code to convert  double feet2yards = 0.333333;
// Method to convert meters to inches and return the value.
// Use following code to convert  double meters2inches = 39.3701;
// Method to convert inches to meters and return the value.
// Use following code to convert  double inches2meters = 0.0254;
// Method to convert inches to centimeters and return the value.
// Use the following code  double inches2cm = 2.54;


import java.util.Scanner;

public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0; 
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; 
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; 
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; 
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54; 
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Use following value to convert 
        double yards = 10.0;
        double feet = 20.0;
        double meters = 15.0;
        double inches = 30.0;

        // Convert yards to feet
        double feetFromYards = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet.");

        // Convert feet to yards
        double yardsFromFeet = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards.");

        // Convert meters to inches
        double inchesFromMeters = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inchesFromMeters + " inches.");

        // Convert inches to meters
        double metersFromInches = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters.");

        // Convert inches to centimeters
        double cmFromInches = convertInchesToCm(inches);
        System.out.println(inches + " inches is equal to " + cmFromInches + " centimeters.");
    }
}
