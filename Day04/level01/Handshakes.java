// Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for number of students
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Write a method to use the combination formulae to calculate the number of handshakes

import java.util.*;

public class Handshakes {
	
	public static int handshakeCount(int students) {
		// = (n * (n - 1)) / 2 formula
		
		int handshakeCount = (int)((students * (students - 1)) / 2.0);
		
		return handshakeCount;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get integer input for number of students
		int students = input.nextInt();
		
		// passing students as parameter
		int handshakeCount = Handshakes.handshakeCount(students);
		
		// printing the return value from method
		System.out.println("The handshake count is :" + handshakeCount);
		
		input.close();
		
	}
}