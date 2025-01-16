// Find unique characters in a string using charAt() method and display the result
// Hint => 
// Create a Method to find the length of the text without using the String method length()
// Create a method to Find unique characters in a string using charAt() method and return them as 1D array. The logic used here is as follows:
// Create an array to store the unique characters in the text. The size is the length of the text
// Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
// Create a new array to store the unique characters 
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 


import java.util.Scanner;

class UniqueCharacter {
    // Method to find the length of the string 
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                // Attempt to access the next character
                text.charAt(length);
                length++;
            } catch (IndexOutOfBoundsException e) {
                // Break the loop when an IndexOutOfBoundsException is thrown
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Loop to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array of the exact size for unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display the result
        System.out.print("Unique characters in the string: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }
        scanner.close();
    }
}

