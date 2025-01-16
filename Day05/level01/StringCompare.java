// Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
// Hint => 
// Take user input using the  Scanner next() method for 2 String variables
// Write a method to compare two strings using the charAt() method and return a boolean result
// Use the String Built-In method to check if the results are the same and display the result 

import java.util.*;

public class StringCompare {
	// method to check if two string is equal or not
	public static boolean isEqualString(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// taking both string as input
		
		String str1 = input.next();
		String str2 = input.next();
		
		// method to find if they are equall or not by using charAt method
		boolean isEqualString = isEqualString(str1, str2);
		if (isEqualString) {
			System.out.println("Both string are equall");
		}
		else {
			System.out.println("Not equal");
		}
		
		input.close();
		
	}
}