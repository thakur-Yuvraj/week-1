
// Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
// Hint => 
// Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
// Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
// Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
// Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
// Create a Method to display the 2D Array of Strings in a Tabular Format
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 


import java.util.Scanner;

public class CountVowelsConsonantsSecond {

	// Method to check a word is vowel or a consonant
	public static boolean isVowel(char ch) {
		//Coverting character to lowerCase
		if(ch >= 65 && ch <= (65+25)){
			ch = (char)(ch+32);
		}
		
		// Condition for checking ch is a vowel or not
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true; // is a vowel
		}
		else {
			return false; // not a vowel 
		}
	}
	
	// Method to check not a Letter
	public static boolean isAlphabet(char ch) {
		if(ch >= 65 && ch <= (65+25)){
			ch = (char)(ch+32);
		}
		
		// Condition for checking the charater is alphabet
		if(ch >= 97 && ch <= (97+25)) {
			return true; // is a alphabet
		}
		else {
			return false; // Not a alphabet
		}
	}
	
	// Method to get the character is vowel consonant or not a letter
	public static String[][] checkCharacter(String text) {
		text = text.replaceAll(" ","");  //Replace all white space to get the proper length
		String[][] result = new String[text.length()][2];
		
		//Looping through each character
		for(int i=0; i<text.length(); i++) {
			if(isVowel(text.charAt(i))) {
				result[i][0] = String.valueOf(text.charAt(i));
				result[i][1] = "Vowel";
			}
			else if(isAlphabet(text.charAt(i))) {
				result[i][0] = String.valueOf(text.charAt(i));
				result[i][1] = "Consonant";
			}
			else {
				result[i][0] = String.valueOf(text.charAt(i));
				result[i][1] = "Not a Letter";
			}
		}
		return result;
	}
	
	// Method to display the result
	public static void display(String[][] result) {
		
		System.out.println("Character  "+"Type");
		//Iterating throught result
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.print("\n"); //New line
		}
	}
	

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the text
		System.out.print("Enter text: ");
		String text = input.nextLine();     //input a text
		
		//Call method to get the result
		String[][] result = checkCharacter(text);
		
		//display the result
		display(result);
	
		input.close();
	}
}