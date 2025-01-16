// Create a program to print a multiplication table of a number.
// Hint => 
// Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
// Run a loop from 1 to 10 and store the results in the multiplication table array
// Finally, display the result from the array in the format number * i = ___

import java.util.*;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// taking input and storing it in number variable
		int number = input.nextInt();
		
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