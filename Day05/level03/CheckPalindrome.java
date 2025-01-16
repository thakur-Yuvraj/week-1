// Write a program to to check if a text is palindrome and display the result
// Hint => 
// Palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
// Logic 1: Write a method to compare the characters from the start and end of the string to determine the text is palindrome. The logic used here is as follows:
// Set the start and end indexes of the text
// Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
// Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
// First, check if the start index is greater than or equal to the end index, then return true.
// If the characters at the start and end indexes are not equal, return false.
// Otherwise, call the method recursively with the start index incremented by 1 and the end index
// Logic 3: Write a Method to compare the characters from the start and end of the text using  character arrays. The logic used here is as follows:
// Firstly Write a Method to reverse a string using charAt() method and return the reversal array.
// Create a character array using String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do Palindrome check 
// Finally in the main method do palindrom check using the three logic and display result


import java.util.*;
public class CheckPalindrome{	
	//Iterative method to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //Method to check palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char originalArray[] = text.toCharArray();
        char reverseArray[] = new char[originalArray.length];

        //Reverse the string
        for (int i=0;i<originalArray.length;i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        //Compare original and reversed arrays
        for (int i=0;i<originalArray.length;i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking input for the string
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        //Check for palindrome using all three methods
        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean charArrayResult = isPalindromeUsingCharArray(text);

        //Display the results
        System.out.println("Is the text a palindrome? (Iterative): " + iterativeResult);
        System.out.println("Is the text a palindrome? (Recursive): " + recursiveResult);
        System.out.println("Is the text a palindrome? (Using Char Array): " + charArrayResult);
        scanner.close();
    }

}	
	

