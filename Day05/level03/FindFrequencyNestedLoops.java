
// Write a program to find the frequency of characters in a string using nested loops and display the result
// Hint => 
// Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
// Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
// Loops to Find the frequency of each character in the text and store the result in an frequency array. For this use Nested Loop with Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
// Create an 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 

import java.util.*;

public class FindFrequencyNestedLoops{

   //Method to find the frequency of characters in a string
   public static String[] findFrequencies(String text) {
       char characters[] = text.toCharArray(); //Convert string to character array
       int frequencies[] = new int[characters.length]; //Frequency array

       //Outer loop to initialize and count frequency
       for (int i=0;i<characters.length;i++) {
           if (characters[i] == '0') {
               continue;
           }
           frequencies[i] = 1;
           //Inner loop to check for duplicates
           for (int j=i + 1;j<characters.length;j++) {
               if (characters[i] == characters[j]) {
                   frequencies[i]++;
                   characters[j] = '0';
               }
           }
       }

       //Create a result array to store characters and their frequencies
       String[] result = new String[characters.length];
       int index = 0;

       for (int i=0;i<characters.length;i++) {
           if (characters[i] != '0') {
               result[index++] = characters[i] + "  |  " + frequencies[i];
           }
       }

       //Resize result array to remove null values
       String[] finalResult = new String[index];
       System.arraycopy(result, 0, finalResult, 0, index);

       return finalResult;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       //Taking input from user
       System.out.print("Enter a string: ");
       String input = scanner.nextLine();

       //Get character frequencies
       String frequencies[] = findFrequencies(input);

       //Display the result
       System.out.println("Character | Frequency");
       System.out.println("----------------------");
       for (int i=0;i<frequencies.length;i++) {
           System.out.println("    "+frequencies[i]);
       }
       scanner.close();

   }

}

