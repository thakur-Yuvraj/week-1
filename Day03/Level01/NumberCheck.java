// Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
// Hint => 
// Define an integer array of 5 elements and get user input to store in the array.
// Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
// If the number is negative, print negative. Else if the number is zero, print zero. 
// Finally compare the first and last element of the array and display if they equal, greater or less


import java.util.*;

public class NumberCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// size of array
		int totalNums = 5;
		int nums[] = new int[totalNums];
		// taking input of nums
		for (int i = 0; i < totalNums; i++) {
			nums[i] = input.nextInt();
		}


		// looping through the array using length 
		for (int i = 0; i < nums.length; i++) {
			int curNum = nums[i];
			if (curNum < 0) {
				System.out.println("the "+curNum+" is negative");
			}else if (curNum > 0) {
				System.out.print("the "+curNum+" is Positive"+ " and is ");
				if (curNum % 2 == 0) {
					System.out.println("Even");
				}else {
					System.out.println("Odd");
				}
			}
			else {
				System.out.println("the "+curNum+" is Zero");
			}
		}
		if (nums[0] == nums[nums.length - 1]) {
			System.out.println("the first and last element is equall");
		}if (nums[0] > nums[nums.length - 1]) {
			System.out.println("the first number is greater");
		}else {
			System.out.println("the last number is greater");
		}
		
		input.close();
	}
}