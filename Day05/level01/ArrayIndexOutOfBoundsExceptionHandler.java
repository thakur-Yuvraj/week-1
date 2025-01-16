// Write a program to demonstrate ArrayIndexOutOfBoundsException
// Hint => 
// Define a variable of array of names and take input from the user
// Write a Method to generate the Exception. Here access index larger then the length of the array.
// This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array.
// This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


import java.util.*;

public class ArrayIndexOutOfBoundsExceptionHandler {
	
	// printing the names of student array
	public static void printNames(String[] names) {
		
		try {
			for (int i = 0; i <= names.length; i++) {
				System.out.println(names[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Define a variable of array of names and take input from the user
		String[] names = new String[3];
		
		System.out.println("Enter 3 names");
		for (int i = 0; i < names.length; i++) {
			names[i] = input.next();
		}
		
		// calling the printing method to demonstrate the ArrayIndexOutOfBoundsException
		printNames(names);
		
		input.close();
		
	}
}