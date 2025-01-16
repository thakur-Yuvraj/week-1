// Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
// Hint => 
// Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
// Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
// Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
// Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 



import java.util.Scanner;

public class CountVowelsConsonants {

	// Method to check a word is vowel or a consonant
	public static boolean isVowel(char ch) {
		//Coverting character to lowerCase
		if(ch >= 65 && ch <= (65+25)){
			ch = (char)(ch+32);
		}
		
		// a e i o u are vowels
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true; // is a vowel
		}
		else {
			return false; // not a vowel 
		}
	}
	
	// Method to check not a alphabet
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
	
	// Method to count number of vowels and consonants in a text
	public static int[] getCount(String text) {
		int countVowels = 0;   
		int countConsonants = 0; 
		int[] result = new int[2];     
		
		// iterate through each character to check its a vowel or a consonant
		for(int i=0; i<text.length(); i++) {
			if(isVowel(text.charAt(i))) {
				countVowels++;     
			}
			else if(isAlphabet(text.charAt(i))) {
				countConsonants++;  
			}
		}
		result[0] = countVowels;        //0th index stores number of vowels
		result[1] = countConsonants;   //1st index stores number of consonanats
		
		return result;
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the text
		System.out.print("Enter text: ");
		String text = input.nextLine();     //input a text
		
		//Call method to get the result
		int[] result = getCount(text);
		
		//Output
		System.out.println("Number of vowels: "+result[0]); //print number of vowels
		System.out.println("Number of consonants: "+result[1]);
	
		input.close();
	}
}