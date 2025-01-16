// Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring()
// to find the substring of the text. Finally Compare the the two strings and display the results
// Hint => 
// Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get
// the substring from the given text
// Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
// Write a method to compare two strings using the charAt() method and return a boolean result
// Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result

import java.util.*;

public class SubstringCheck {
	
	// method to create substring
	public static String createSubStr(String str, int startIdx, int endIdx) {
		// creating a new string
		String subStr = "";
		for (int i = startIdx; i < endIdx; i++) {
			subStr += str.charAt(i);
		}
		
		return subStr;
	}
	
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
		// taking a string as input
		String str = input.next();
		// taking start and end as input
		int startIdx = input.nextInt();
		int endIdx = input.nextInt();
		
		// method to create a substring from  string using the charAt()
		String subStr1 = createSubStr(str, startIdx, endIdx);
		// built-in method
		String subStr2 = str.substring(startIdx, endIdx);
		
		// comparing the both string by creating a new method
		boolean isEqualString = isEqualString(subStr1, subStr2);
		
		// printing the result
		
		if (isEqualString) {
			System.out.println("Both sub-string are equal");
		}else {
			System.out.println("Sub-string are not equal");
		}
		
		input.close();
		
	}
}