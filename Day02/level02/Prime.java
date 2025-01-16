// Write a Program to check if the given number is a prime number or not
// Hint => 
// A number that can be divided exactly only by itself and 1 are Prime Numbers,
// Prime Numbers checks are done for numbers greater than 1
// Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
// Use isPrime boolean variable to store the result

import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        // Create a Scanner object for user input and Get the number from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();

        boolean isPrime = true;

        // Loop from 2 to the number
        for (int i = 2; i <= number; i++) {
            // If the number is divisible by any number between 2 and number, it's not prime
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // output
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } 
        else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}




