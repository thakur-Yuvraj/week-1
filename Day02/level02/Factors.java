// Create a program to find the factors of a number taken as user input.
// Hint => 
// Get the input value for a variable named number.
// Run a for loop from i = 1 to i < number.
// In each iteration of the loop, check if number is perfectly divisible by i.
// If true, print the value of i.


import java.util.Scanner;

public class Factors {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Get the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Factors of " + number + " are:");
        

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                // If divisible, print i as a factor
                System.out.println(i);
            }
        }
        
        input.close();
    }
}
