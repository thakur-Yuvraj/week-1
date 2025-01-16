// Create a program to check if a number is an Abundant Number.
// Hint => 
// An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
// Divisor of 12: 1, 2, 3, 4, 6
// Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
// Get an integer input for the number variable.
// Create an integer variable sum with initial value 0.
// Run a for loop from i = 1 to i < number.
// Inside the loop, check if number is divisible by i.
// If true, add i to sum.
// Outside the loop Check if sum is greater than number.
// If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.



import java.util.*;

public class AbundantNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int sum = 0;
		
		// to check for abundant num we first need to calculate divisors of that number and add them together
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		
		// finally we check if the sum is greater than number
		if (sum > num) {
			System.out.println("It is an abundant number");
		}
		else {
			System.out.println("It is not an abundant number");
		}
		
		input.close();
		
	}
}