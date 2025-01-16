// Write a program to create a calculator using switch...case.
// Hint => 
// Create two double variables named first and second and a String variable named op.
// Get input values for all variables.
// The input for the operator can only be one of the four values: "+", "-", "*" or "/".
// Run a for loop from i = 1 to i < number.
// Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
// If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
// If op is neither of those 4 values, print Invalid Operator.

import java.util.*;

public class CalculatorBySwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two number and a operator");
		
		// creating 2 double variables and a string variable and taking input
		double first = input.nextDouble();
		double second = input.nextDouble();
		
		char op = input.next().charAt(0);
		
		// with op we can determine which operation we need to perform
		switch(op) {
			case '+': System.out.println(first + second);
						break;
			
			case '-': System.out.println(first - second);
						break;
			
			case '*': System.out.println(first * second);
						break;
						
			case '/': System.out.println(first / second);
						break;
			default  :   System.out.println("Invalid Operator");
		};
		
		
		input.close();
		
	}
}