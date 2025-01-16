
// Write a program to find the frequency of characters in a string using unique characters and display the result
// Hint => 
// Create a method to Find unique characters in a string using charAt() method and return them as 1D array.  Use Nested Loops to find the unique characters in the text
// Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
// Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
// Loop through the text to find the frequency of characters in the text
// Call the uniqueCharacters() method to find the unique characters in the text
// Create a 2D String array to store the unique characters and their frequencies. 
// Loop through the unique characters and store the characters and their frequencies
// In the main function take user inputs, call user-defined methods, and displays result.  

import java.util.*;

public class FindFrequency{

    //Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        String unique = "";

        for (int i=0;i<text.length();i++) {
            char currChar = text.charAt(i);
            if(unique.indexOf(String.valueOf(currChar)) == -1) {
                unique += (currChar);
            }
        }

        return unique.toString().toCharArray();
    }

    // Method to find the frequency of characters in a string
    public static String[][] characterFrequency(String text) {
        int frequency[] = new int[256]; // Array to store frequency using ASCII values

        //Calculate frequency of each character
        for (int i=0;i<text.length();i++) {
            frequency[text.charAt(i)]++;
        }

        //Get unique characters
        char uniqueChars[] = uniqueCharacters(text);

        //Create 2D array to store unique characters and their frequencies
        String result[][] = new String[uniqueChars.length][2];

        for (int i=0;i<uniqueChars.length;i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        //Get character frequencies
        String frequencies[][] = characterFrequency(input);

        //Display the result
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (int i=0;i<frequencies.length;i++) {
            System.out.println(frequencies[i][0] + " | " + frequencies[i][1]);
        }
        scanner.close();
    }

}


