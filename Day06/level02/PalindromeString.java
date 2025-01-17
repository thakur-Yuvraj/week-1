// Program to Check Palindrome String
// Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
// Check if the text is a palindrome.
// Display the result.
// Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.

import java.util.Scanner;

// Create a PalindromeChecker class with an attribute text. Add methods to:
// Check if the text is a palindrome.
class PalindromeChecker{
    // attribute
    private String text = null;

    // method to check if text is palindrome or not
    boolean palindromeChecker() {
        int st = 0;
        int ed = text.length();
        while (st < ed) {
            if (text.charAt(st) != text.charAt(ed)) {
                return false;
            }
        }
        return true;
    }

    // method to set the text
    void setText(String text) {
        this.text = text;
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        // creating a scanner object
        Scanner sc = new Scanner(System.in);

        // taking a string as input
        String text = sc.next();

        // making a pallindrome checker object
        PalindromeChecker palindromeCheck = new PalindromeChecker();

        // setting the text
        palindromeCheck.setText(text);

        // checking if input is pallindrome or not
        palindromeCheck.palindromeChecker();

        // closing the scanner
        sc.close();
    }
}
