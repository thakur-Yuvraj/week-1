// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
// Hint => Simple Interest = Principal * Rate * Time / 100
// I/P => principal, rate, time
// O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Prompt for the Principal, Rate, and Time
        System.out.println("Enter the Principal");
        double principal = input.nextDouble();

        System.out.println("Enter the Rate of Interest");
        double rate = input.nextDouble();

        System.out.println("Enter the Time period in years");
        double time = input.nextDouble();

        // Calculate Simple Interest 
        double simpleInterest = (principal * rate * time) / 100;

        // Output
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time
);

        input.close();
    }
}
