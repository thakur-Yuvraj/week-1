// Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
// Hint => 
// Get an integer value from user for the numberOfchocolates and numberOfChildren.
// Write the method to find the number of chocolates each child gets and number of remaining chocolates
// public static int[] findRemainderAndQuotient(int number, int divisor) 


import java.util.Scanner;

public class ChocolatesDistribution {
	
	public static int[] findRemainderAndQuotient(int chocolates, int children) {
		
		int output[] = new int[2];
		// moduli operator (%) for reminder
		output[0] = chocolates % children;
		
		 // Use division operator (/) for quotient
		output[1] = chocolates / children;
		
		return output;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take user input as integer
		int chocolates = input.nextInt();
		int children = input.nextInt();
		
		// calling the RemainderAndQuotient method
		
		int chocolatesChildren[] = findRemainderAndQuotient(chocolates, children);
		
		// printing the output
		System.out.println("each child has : "+ chocolatesChildren[1] + "chocolates and undistributed chocolates are "+ chocolatesChildren[0]);
		
		input.close();
		
	}
}