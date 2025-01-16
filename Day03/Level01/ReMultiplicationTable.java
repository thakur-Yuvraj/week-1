// Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
// Hint => 
// Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
// Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
// Finally, display the result from the array in the format number * i = ___

import java.util.*;

public class ReMultiplicationTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// taking input and storing it in number variable
		System.out.println("Enter number between 6 and 9");
		int number = input.nextInt();
		
		// Checking if it is valid or not
		if (number < 6 || number > 9) {
			System.out.println("Not a valid Input");
			System.exit(0);
		}
		
		// creating an array of size 10 for storing the result
		int sizeArr = 10;
		int multiplicationTable[] = new int[sizeArr];
		
		
		
		// calculate the numbeer table
		for (int i = 1; i <= multiplicationTable.length; i++){
			multiplicationTable[i-1] = i * number;
		}
		// printing output stored in array
		for (int i = 0; i < multiplicationTable.length; i++) {
			System.out.println(number + " * "+ (i+1) + " : "+ multiplicationTable[i]);
		}
		
		input.close();
		
	}
}