// Write a program to split the text into words and find the shortest and longest strings in a given text
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Create a method to find and return a string's length without using the length() method. 
// Create a method to take the word array and return a 2D String array of the word and its corresponding length.
// Use String built-in function String.valueOf() to generate the String value for the number
// Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
// The main function calls the user-defined methods and displays the result. 

import java.util.*;

public class ShortestLongestString {
	
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
	// method to create 2d array of string and their length
	public static String[][] wordsWithLen(String[] words) {
		
		// creating 2d array 
		String[][] wordsWithLen = new String[words.length][2];
		for (int i = 0; i < words.length; i++) {
			wordsWithLen[i][0] = words[i];
			wordsWithLen[i][1] = String.valueOf(stringLength(words[i]));
		}
		// returning the ans
		
		return wordsWithLen;
	}
	
	// method to find shortest longest string in an array
	public static String[] shortestLongestStr(String[][] wordsWithLen) {
		int minLength = Integer.MAX_VALUE;
		String minStr = null;
		int maxLength = Integer.MIN_VALUE;
		String maxStr = null;
		
		for (int i = 0; i < wordsWithLen.length; i++) {
			int curLen = Integer.parseInt(wordsWithLen[i][1]);
			String curWord = wordsWithLen[i][0];
			if (curLen > maxLength) {
				String minStr = curLen;
			}
			if (curLen < minLength) {
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take user input using the Scanner nextLine() method 
		String text = input.nextLine();
		
		// calling a Method to split the text into words using the charAt() method.
		String[] words = textToWords(text);
		
		// Create a method to take the word array and return a 2D String array of the word and its corresponding length.
		String[][] wordsWithLen = wordsWithLen(words);
		
		// printing the value stored in 2d array
		for (int i = 0; i < wordsWithLen.length; i++) {
			System.out.println("the word : ("+ wordsWithLen[i][0]+ ") has : "+ wordsWithLen[i][1] + " length");
		}
		input.close();
		
	}
}