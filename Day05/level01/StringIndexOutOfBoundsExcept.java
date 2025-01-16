// Write a program to demonstrate StringIndexOutOfBoundsException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String.
// This will generate a runtime exception and abruptly stop the program.
// Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String.
// Then write try catch block for Exception while accessing the String method
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


import java.util.*;

public class StringIndexOutOfBoundsExcept{
	
	public static void demonstrateException(String string) {
		try {
		char valAtEnd = string.charAt(string.length());
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// taking user input for a string
		String str = input.next();
		
		// method to trigger string index out of bound exception
		demonstrateException(str);
		
		input.close();
		
	}
}