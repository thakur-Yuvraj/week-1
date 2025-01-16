// Write a program to convert the complete text to uppercase and compare the results
// Hint => 
// Take user input using the  Scanner nextLine() method to take the complete text into a String variable
// Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case.
// Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is
// 32, and so on
// Write a method to compare two strings using the charAt() method and return a boolean result
// In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method.
// And finally display the result

import java.util.*;

public class ConvertTextToUppercase {
	
	// to_uppercase method
	public static String toUpperCase(String text) {
		String upperCaseText = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				upperCaseText += (char) (text.charAt(i) - 32);
			}
			else {
				upperCaseText += text.charAt(i);
			}
		}
		return upperCaseText;
	}
	
	// a method to compare two strings using the charAt() method and return a boolean result
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
		// Take user input using the  Scanner nextLine() method to take the complete text into a String variable
		System.out.println("Enter some text");
		String text = input.nextLine();
		
		// method to convert text to uppercase
		
		String upperCaseText1 = toUpperCase(text);
		// built-in method
		String upperCaseText2 = text.toUpperCase();
		
		// checking if they are equal or not
		
		boolean textEquals = isEqualString(upperCaseText1, upperCaseText2);
		
		// printing the result
		if (textEquals) {
			System.out.println("Both text to uppercase are equal");
		}
		else {
			System.out.println("Both text conversion are not equal");
		}
		
		
		input.close();
		
	}
}