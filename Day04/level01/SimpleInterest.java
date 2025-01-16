// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
// Hint => 
// Simple Interest = Principal * Rate * Time / 100
// Take user input for principal, rate, time
// Write a method to calculate the simple interest given principle, rate and time as parameters
// Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

import java.util.*;

public class SimpleInterest {
	
	public static double calculateInterest(double principal, double rate, double time) {
		//Simple Interest = Principal * Rate * Time / 100
		double simpleInterest = principal * rate * time / 100;
		
		// returning the output back to main
		return simpleInterest;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double principal, rate, time;
		
		// taking input in double variables
		System.out.println("Input principal rate and time");
		principal = input.nextDouble();
		rate = input.nextDouble();
		time = input.nextDouble();
		
		// calling the calculating method
		double simpleInterest = SimpleInterest.calculateInterest(principal, rate, time);
		
		// output
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+ time);
		
		input.close();
		
	}
}