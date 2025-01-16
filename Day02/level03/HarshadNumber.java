// Create a program to check if a number taken from the user is a Harshad Number.
// Hint => 
// A Harshad number is an integer which is divisible by the sum of its digits. 
// For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
// Get an integer input for the number variable.
// Create an integer variable sum with initial value 0.
// Create a while loop to access each digit of the number.
// Inside the loop, add each digit of the number to sum.
// Check if the number is perfectly divisible by the sum.
// If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.



import java.util.*;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int numOrg = num;
		int sumOfDigit = 0;
		while (num > 0) {
			sumOfDigit += num % 10;
			num = num / 10;
		}
		if (numOrg % sumOfDigit == 0) {
			System.out.println("Yes it is HarshadNumber");
		}
		else {
			System.out.println("No it is not a HarshadNumber");
		}
		input.close();
		
	}
}