// Create a program to count the number of digits in an integer.
// Hint => 
// Get an integer input for the number variable.
// Create an integer variable count with value 0.
// Use a loop to iterate until number is not equal to 0.
// Remove the last digit from number in each iteration
// Increase count by 1 in each iteration.
// Finally display the count to show the number of digits


import java.util.*;

public class CountDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		// iterating until num becomes zero
		int numberOfDigit = 0;
		while(num > 0) {
			// removing digit
			num = num / 10;
			// incrementing digits
			numberOfDigit++;
		}
		
		System.out.println("Number of digits in number is "+ numberOfDigit);
		input.close();
		
	}
}