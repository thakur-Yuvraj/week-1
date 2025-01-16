// Write a program to take 2 numbers and print their quotient
// and reminder
// Hint => 
// Take user input as integer
// Use division operator (/) for quotient and moduli operator
// (%) for reminder
// Write Method to find the reminder and the quotient of a
// number 
// public static int[] findRemainderAndQuotient(int number, int divisor) 


import java.util.Scanner;

public class QuotientRemainder {
	
	public static int[] findRemainderAndQuotient(int num, int divisor) {
		
		int output[] = new int[2];
		// moduli operator (%) for reminder
		output[0] = num % divisor;
		
		 // Use division operator (/) for quotient
		output[1] = num / divisor;
		
		return output;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take user input as integer
		int number = input.nextInt();
		int divisor = input.nextInt();
		
		// calling the RemainderAndQuotient method
		
		int reminderQuotient[] = findRemainderAndQuotient(number, divisor);
		
		// printing the output
		System.out.println("The reminder and quotient is : "+ reminderQuotient[0] + " and "+ reminderQuotient[1]);
		
		input.close();
		
	}
}