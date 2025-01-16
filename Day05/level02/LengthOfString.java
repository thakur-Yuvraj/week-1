// Write a program to find and return the length of a string without using the length() method 
// Hint => 
// Take user input using the Scanner next() method 
// Create a method to find and return a string's length without using the built-in length() method.
// The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
// The main function calls the user-defined method as well as the built-in length() method and displays the result

import java.util.*;

public class LengthOfString {
	
	// method to find length of string 
	public static int stringLength(String str) {
		int length = 0;
		while (true) {
			try{
				str.charAt(length);
			}
			catch(StringIndexOutOfBoundsException e) {
				return length;
			}
			length++;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take user input using the Scanner next() method 
		String str = input.next();
		
		// calling the length function
		int length = stringLength(str);
		
		// printing the length
		
		System.out.println("Length is : "+ length);
		
		input.close();
		
	}
}