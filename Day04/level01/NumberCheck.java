
// Write a program to check whether a number is positive, 
//negative, or zero.
// Hint => Get integer input from the user. Write a Method to 
//return -1 for negative number, 1 for positive number and 0 if number is zero



import java.util.*;

public class NumberCheck {
	
	public static int numPolarity(int num) {
		if (num > 0) {
			return 1;
		}
		if (num < 0) {
			return -1;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int num = input.nextInt();
		
		int polarity = NumberCheck.numPolarity(num);
		
		// output the type o polarity
		System.out.println("It polarity is " +polarity);
		
		
		input.close();
	}
}