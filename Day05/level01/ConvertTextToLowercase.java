// Write a program to convert the complete text to lowercase and compare the results
// Hint => 
// Take user input using the  Scanner nextLine() method to take the complete text into a String variable
// Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
// Write a method to compare two strings using the charAt() method and return a boolean result
// In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
// Write a program to split the text into words and return the words along with their lengths in a 2D array


import java.util.*;

public class ConvertTextToLowercase {
	
	// to_lowercase method
	public static String toLowerCase(String text) {
		String lowerCaseText = "";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				lowerCaseText += (char) (text.charAt(i) + 32);
			}
			else {
				lowerCaseText += text.charAt(i);
			}
		}
		return lowerCaseText;
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
		
		// method to convert text to lowerCaseText
		
		String lowerCaseText1 = toLowerCase(text);
		// built-in method
		String lowerCaseText2 = text.toLowerCase();
		
		// checking if they are equal or not
		
		boolean textEquals = isEqualString(lowerCaseText1, lowerCaseText2);
		
		// printing the result
		if (textEquals) {
			System.out.println("Both text to lowerCaseText are equal");
		}
		else {
			System.out.println("Both text conversion are not equal");
		}
		
		
		input.close();
		
	}
}