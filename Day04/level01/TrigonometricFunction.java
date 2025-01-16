// Write a program to calculate various trigonometric functions using Math class given an angle in degrees
// Hint => 
// Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
// public double[] calculateTrigonometricFunctions(double angle)
// optional values that can be passed to method

import java.util.Scanner;


public class TrigonometricFunction {
	public static double[] calculateTrigonometricFunctions(double angle) {
		
		double output[] = new double[3];
		
		// calculating sin
		output[0] = Math.sin(angle);
		// calculating cos
		output[1] = Math.cos(angle);
		// calculating tan
		output[2] = Math.tan(angle);
		
		return output;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// taking input and storing it in double variable
		
		double angle = input.nextDouble();
		
		// calculating various trigonometric functions i.e. sin cos tan
		
		double trigonometricValues[] = TrigonometricFunction.calculateTrigonometricFunctions(angle);
		
		
		// printing the TrigonometricValues
		System.out.println("The value of Sin is : "+ trigonometricValues[0]+
		" The value of Cos is : "+ trigonometricValues[1]+
		" The value of Tan is : "+ trigonometricValues[2]);
		
		input.close();
		
	}
}