// Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
// Hint => 
// Take user input using the  Scanner next() method to take the text into a String variable
// Write a method to return the characters in a string without using the toCharArray() 
// Write a method to compare two string arrays and return a boolean result
// In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result

import java.util.*;

public class StringToCharArr {
	
	
	// converting a string to characters array
	public static char[] stringToCharArr(String str) {
		char[] output = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			output[i] = str.charAt(i);
		}
		return output;
	}
	
	// method to check for equal characters array
	public static boolean isEqualCharArr(char[] arr1, char[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// taking a string input
		String str = input.next();
		
		// user define method to generate a char arrays
		char[] strChar1 = stringToCharArr(str);
		
		// built-in method to generate a char arrays
		char[] strChar2 = str.toCharArray();
		
		// comparing the both char arrays
		boolean isEqualCharArr = isEqualCharArr(strChar1, strChar2);
		
		// printing the output
		if (isEqualCharArr) {
			System.out.println("Both char arrays are equal");
		} else {
			System.out.println("Both char arrays are not equal");
		}
		
		input.close();
		
	}
}