// Write a program to split the text into words, compare the result with the split() method and display the result 
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to find the length of the String without using the built-in length() method. 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Use the following logic
// Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
// Then Create an array to store the words and use the indexes to extract the words
// Create a method to compare the two String arrays and return a boolean
// The main function calls the user-defined method and the built-in split() method.
// Call the user defined method to compare the two string arrays and display the result.


import java.util.*;

public class TextIntoWords {
	
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
	
	// method to check if two string is equal or not
	public static boolean isEqualString(String str1, String str2) {
		if (stringLength(str1) != stringLength(str2)) {
			return false;
		}
		for (int i = 0; i < stringLength(str1); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	// method to split the text into words 
	public static String[] textToWords(String text) {
		int wordCount = 0;
		// counting the number of words
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				while(i < text.length() && text.charAt(i) != ' ') i++;
				wordCount++;
			}
		}
		// creating 1d array
		String[] words = new String[wordCount+1];
		int wordIdx = 0;
		
		// adding words to array
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				String word = "";
				while(i < text.length() && text.charAt(i) != ' ') {
					word += text.charAt(i);
					i++;
				}
				words[wordIdx++] = word; 
				
			}
		}
		return words;
	}

	// method to check if two string arrays are same or not
	public static boolean isEqualStringArr(String[] words1, String[] words2) {
		if (words1.length != words2.length) {
			return false;
		}
		for (int i = 0; i < words1.length; i++) {
			// calling the equalstring method
			if(!isEqualString(words1[i], words2[i])) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take user input using the Scanner nextLine() method 
		String text = input.nextLine();
		
		// calling a Method to split the text into words using the charAt() method.
		String[] words1 = textToWords(text);
		// calling built in method to split the text
		String[] words2 = text.split("\\s+");
		
		// calculation if they are equal 
		boolean isEqualStringArr = isEqualStringArr(words1, words2);
		
		if (isEqualStringArr) {
			System.out.println("Both are equall array");
		}else {
			System.out.println("They are not equal");
		}
		
		input.close();
		
	}
}