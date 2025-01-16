// Create a program to find the mean height of players present in a football team.
// Hint => 
// The formula to calculate the mean is: mean = sum of all elements / number of elements
// Create a double array named heights of size 11 and get input values from the user.
// Find the sum of all the elements present in the array.
// Divide the sum by 11 to find the mean height and print the mean height of the football team

import java.util.*;

public class MeanHeight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// an array of size 11
		double heights[] = new double[11];
		// taking  height input of the football team
		for (int i = 0; i < heights.length; i++) {
			heights[i] = input.nextDouble();
		}
		// calculating the sum height
		int sumHeight = 0;
		for (int i = 0; i < heights.length; i++) {
			sumHeight += heights[i];
		}
		
		// calculating the mean height
		double meanHeight = sumHeight / (double)heights.length;
		
		System.out.println("Mean height of the football team is :"+ meanHeight);
		
		input.close();
		
	}
}