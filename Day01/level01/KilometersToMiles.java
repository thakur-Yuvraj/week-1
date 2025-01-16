// Question
// Create a program to convert distance in kilometers to miles.
// Hint => 
// Create a variable km and assign type as double as in double km;
// Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
// Use Scanner Object to take user input for km as in km = input.nextInt();
// Use 1 mile = 1.6 km formulae to calculate miles and show the output
// I/P => km
// O/P => The total miles is ___ mile for the given ___ km

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        // creating Scanner
        Scanner input = new Scanner(System.in);

        // taking input
        int kilometers = input.nextInt();

        // 1 mile = 1.6 km formulae
        double mile = (double)kilometers / 1.6;

        // output
        System.out.println("The total miles is "+ mile +" mile for the given "+ kilometers +" km");

        input.close();
    }
}
