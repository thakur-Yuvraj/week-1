// Write a program to demonstrate NumberFormatException
// Hint => 
// Define a variable to take user input as a String 
// Use Integer.parseInt() to generate this exception. Integer.parseInt()
// is a built-in function in java.lang.Integer class to extract the number from text.
// In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
// Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text.
// This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text.
// This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

import java.util.*;

public class NumberFormatExceptionHandler {
	
	public static void demonstrateException(String string) {
		try{
		int number = Integer.parseInt(string);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// taking user input for a string
		String str = input.next();
		
		// method to trigger NumberFormatException
		demonstrateException(str);
		input.close();
		
	}
}