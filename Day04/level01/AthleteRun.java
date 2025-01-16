// An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
// Hint => 
// Take user input for 3 sides of a triangle 
// The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
// Write a Method to compute the number of rounds user needs to do to complete 5km run

import java.util.*;

public class AthleteRun {
	
	public static double numberOfRounds(int side1, int side2, int side3, int distance) {
		// The perimeter of a triangle is the addition of all sides and rounds
		
		int perimeter = side1 + side2 + side3;
		double rounds = ((double)distance / perimeter);
		return rounds;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take user input for 3 sides of a triangle 
		System.out.println("Enter the 3 sides of a triangle");
		
		int triangleSideOne = input.nextInt();
		int triangleSideTwo = input.nextInt();
		int triangleSideThree = input.nextInt();
		
		// run distance in km
		int runDistance = 5;
		
		// calculation by method
		double numberOfRounds = AthleteRun.numberOfRounds(triangleSideOne, triangleSideTwo, triangleSideThree, runDistance);
		
		// output
		System.out.println("The number of rounds needed by athlete is :" + numberOfRounds);
		
		input.close();
		
	}
}