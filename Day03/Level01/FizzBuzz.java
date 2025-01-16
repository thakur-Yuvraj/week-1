// Write a program FizzBuzz, take a number as user input and
// if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3
// save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both
// save "FizzBuzz". Finally, print the array results for each index position in the format
// Position 1 = 1, …, Position 3 = Fizz,...
// Hint => 
// Create a String Array to save the results and 
// Finally, loop again to show the results of the array based on the index position

import java.util.*;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer");
		int number = input.nextInt();
		// if it is a negative integer we exit with exit code 1
		if (number < 0) {
			System.out.println("Invalid integer");
			System.exit(1);
		}
		// string array creation
		
		String fizzBuzz[] = new String[number+1];
		
		// loop on given number
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzz[i] = "fizzbuzz";
			}
			else if (i % 3 == 0) {
				fizzBuzz[i] = "fizz";
			}
			else if (i % 5 == 0) {
				fizzBuzz[i] = "buzz";
			}
			else {
				fizzBuzz[i] = Integer.toString(i);
			}
		}
		
		// output
		for (int i = 1; i < fizzBuzz.length; i++) {
			System.out.println(fizzBuzz[i]);
		}
		
		input.close();
		
	}
}