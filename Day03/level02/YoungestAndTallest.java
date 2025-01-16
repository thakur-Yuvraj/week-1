// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their
// ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for age and height for the 3 friends and store it in two arrays each
// to store the values for age and height of the 3 friends
// Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
// Finally display the youngest and tallest of the 3 friends

import java.util.*;

public class YoungestAndTallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// create 2 arrays to store values of height and age
		int numberOfFriends = 3;
		double heights[] = new double[numberOfFriends];
		int age[] = new int[numberOfFriends];
		String friends[] = {"Amar", "Akbar", "Anthony"};
		
		
		// now we take input for height and age
		for (int i = 0; i < numberOfFriends; i++) {
			System.out.println("Enter age and height of "+ friends[i]);
			age[i] = input.nextInt();
			heights[i] = input.nextDouble();
		}
		input.close();
		
	}
}