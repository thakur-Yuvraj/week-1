// Create a program to save odd and even numbers into odd and even arrays between 1 to the
// number entered by the user. Finally, print the odd and even numbers array
// Hint => 
// Get an integer input from the user, assign it to a variable number, and check for Natural Number.
// If not a natural number then print an error and exit the program
// Create an integer array for even and odd numbers with size = number / 2 + 1
// Create index variables for odd and even numbers and initialize them to zero
// Using a for loop, iterate from 1 to the number, and in each iteration of the loop,
// save the odd or even number into the corresponding array
// Finally, print the odd and even numbers array using the odd and even index


import java.util.*;

public class OddEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter natural number :");
		
		int number = input.nextInt();
		// cheking if it is natural number or not
		if (number  < 1) {
			System.out.println("Invalid input");
			System.exit(1);
		}
		// we need to create two separate arrays to store even odd nums
		int even[] = new int[(number / 2) + 1];
		int odd[] = new int[(number / 2) + 1];
		// iterators for both arrays
		int evenIdx = 0;
		int oddIdx = 0;
		
		// computing until we reach number
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				even[evenIdx] = i;
				evenIdx++;
				
				
			}else {
				odd[oddIdx] = i;
				oddIdx++;
			}
		}
		// printing even and odd arrays
		for (int i = 0; i <= evenIdx-1; i++) {
			System.out.println(even[i] +" is Even");
		}
		for (int i = 0; i <= oddIdx-1; i++) {
			System.out.println(odd[i] +" is Odd");
		}
		
		input.close();
		
	}
}