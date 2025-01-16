// Write a program to find the smallest and the largest of the 3 numbers.
// Hint => 
// Take user input for 3 numbers
// Write a single method to find the smallest and largest of the three numbers
// public static int[] findSmallestAndLargest(int number1, int number2, int number3)

import java.util.*;

public class SmallestLargest {
	
	public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
		int smallest = -1;
		int largest = -1;
		
		// for largest number
		if (num1 > num2 && num1 > num3) {
			largest = num1;
		}else if (num2 > num3) {
			largest = num2;
		}else {
			largest = num3;
		}
		
		// for smallest number
		if (num1 < num2 && num1 < num3) {
			smallest = num1;
		}else if (num2 < num3) {
			smallest = num2;
		}else {
			smallest = num3;
		}
		int output[] = {smallest, largest};
		return output;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers :");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		// calling the findSmallestAndLargest method
		int ans[] = findSmallestAndLargest(num1, num2, num3);
		
		System.out.println("Smallest and largest is : " + ans[0] + " and "+ ans[1] + " respectively");
		
		input.close();
		
	}
}