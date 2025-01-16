// Write a program to demonstrate IllegalArgumentException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index.
// This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index.
// This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

import java.util.Scanner;

public class IllegalArgumentExceptHandlear {
	
	public static void demonstrateException(String string) {
		int start = string.length()-1;
		int end  = 0;
		// checking and throwing illegal args exception
		if (start > end) {
			throw new IllegalArgumentException(); 
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// taking user input for a string
		String str = input.next();
		
		// method to trigger IllegalArgumentException
		demonstrateException(str);
		input.close();
		
	}
}