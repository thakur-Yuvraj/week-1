
// Write a program to find the frequency of characters in a string using charAt() method and display the result
// Hint => 
// Create a method to find the frequency of characters in a string using charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
// Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
// Loop through the text to find the frequency of characters in the text
// Create an array to store the characters and their frequencies
// Loop through the characters in the text and store the characters and their frequencies
// In the main function take user inputs, call user-defined methods, and displays result.  

import java.util.*;

public class CharacterFrequency2D{
    //Method to find the frequency of characters
    public static String[] findCharacterFrequency(String text) {
        //Convert the string to a character array
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length]; //Array to store frequency of characters
        String[] result = new String[characters.length]; //Array to store characters and their frequencies

        //Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            // Skip if the character is already counted
            if (frequency[i] == 0) {
                frequency[i] = 1; // Initialize frequency of current character

                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        frequency[j] = 0; // Mark duplicate character
                    }
                }
            }
        }

        //Fill the result array with characters and their frequencies
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) { // Only consider characters with non-zero frequency
                result[index] = characters[i] + ": " + frequency[i];
                index++;
            }
        }

        // Resize the result array to remove unused slots
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        //Find the frequency of characters
        String[] frequencies = findCharacterFrequency(text);

        //Display the result
        System.out.println("Character frequencies:");
        for (int i=0;i< frequencies.length;i++) {
            System.out.println(frequencies[i]);
        }
        scanner.close();
    }
}


