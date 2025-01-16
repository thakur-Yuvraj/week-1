// Create a program to find all the multiple of a number taken as user input below 100.
// Hint => 
// Get input value for a variable named number.
// Run a for loop backward: from i = 100 to i = 1.
// Inside the loop, check if i perfectly divide the number.
// If true, print the number and continue the loop.

import java.util.Scanner;

public class MultipleOfNum {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        

        System.out.println("Multiples of " + number + " below 100 are:");
        
        // Run a for loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the input number
            if (i % number == 0) {
                // Print the number if it's a multiple
                System.out.println(i);
            }
        }
        
        input.close();
    }
}
