import java.util.Scanner;

public class splitText3 {
	
	// Method to split a string into words
	public static String[] splitText(String str) { 
		// Count the number of words by splitting the string by spaces
		int countWords = str.split("\\s").length;

		// Store the result in an array of strings
		String[] result = new String[countWords]; 
		int index = 0;
		
		// Iterate over the input string to extract each word
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			StringBuilder sb = new StringBuilder();
			
			// Continue appending characters until a space is encountered (end of word)
			while (i < str.length() && str.charAt(i) != ' ') {      
				sb.append(str.charAt(i));   
				i++;                        
				count++;                    
			}
			
			
			if (count > 0) {  
				result[index] = sb.toString(); 
				index++;  
			}
		}
		// Return the array containing all the words
		return result;
	}
	
	// Method to get the length of each word in the input string
	public static String[][] getWordLength(String[] words) {
		int n = words.length; 

		// Create a 2D array to store words and their corresponding lengths
		String[][] wordLength = new String[n][2];
		
		// Iterate over the words array
		for (int i = 0; i < n; i++) {
			int len = words[i].length(); 
			wordLength[i][0] = words[i];        
			wordLength[i][1] = String.valueOf(len); 
		}
		
		// Return the 2D array containing words and their lengths
		return wordLength;
	}
	
	// Method to find the shortest and longest word based on length
	public static String[] shortestLongest(String[][] wordLength) {
		// Initialize variables to track shortest and longest word lengths
		int strShortLength = Integer.MAX_VALUE;  
		int strLongLength = Integer.MIN_VALUE;   
		String[] result = new String[2];         
		
		// Iterate over the wordLength 2D array to compare word lengths
		for (int i = 0; i < wordLength.length; i++) {
			
		
			if (Integer.parseInt(wordLength[i][1]) <= strShortLength) {
				result[0] = wordLength[i][0]; 
				strShortLength = Integer.parseInt(wordLength[i][1]); 
			}
			
			
			if (Integer.parseInt(wordLength[i][1]) >= strLongLength) {
				result[1] = wordLength[i][0]; 
				strLongLength = Integer.parseInt(wordLength[i][1]); 
			}
		}
		
		// Return the array containing the shortest and longest words
		return result;
	}
	
	public static void main(String args[]) {
	
		// Initialize Scanner to read user input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.println("Enter String: ");
		String text = input.nextLine();
		
		// Get the words from the input string by calling splitText method
		String[] words = splitText(text);
		
		// Get the word lengths by calling getWordLength method
		String[][] wordLength = getWordLength(words);
		
		//Output word length 
		for(int i=0; i<wordLength.length; i++){
			System.out.println(wordLength[i][0]+" "+Integer.parseInt(wordLength[i][1]));
		}
		
		// Get the shortest and longest words by calling shortestLongest method
		String[] result = shortestLongest(wordLength);
		
		// Print the shortest and longest words
		System.out.print("The Shortest string of the text is: " + result[0]);
		System.out.print("\nThe Longest String of the text is: " + result[1]);
		
		// Close the Scanner object to prevent resource leaks
		input.close();
	}
}
