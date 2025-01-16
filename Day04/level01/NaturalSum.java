// Write a program to find the sum of n natural numbers using loop
// Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 


import java.util.Scanner;

public class NaturalSum {
	
	public static int naturalSum(int num) {
		// A sum of n natural numbers is n * (n+1) / 2 
		int sum = num * (num+1) / 2;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a natural number");
		int num = input.nextInt();
		
		if (num < 1) {
			System.out.println("The number " +num+ " is not a natural number");
			System.exit(1);
		}
		
		int sum = NaturalSum.naturalSum(num);
		
		// printing the output
		System.out.println("The sum of "+num+" natural numbers is "+ sum);
		
		input.close();
		
	}
}