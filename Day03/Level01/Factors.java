// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
// Hint => 
// Take the input for a number
// Find the factors of the number and save them in an array. 
// For this create integer variable
// maxFactor and initialize to 10, 
// factors array of size maxFactor and index variable to
// reflect the index of the array. 
// To find factors loop through the numbers from 1 to the number, 
// find the factors, and add them to the array element by incrementing the index. 
//If the index is equal to maxIndex, then need factors array to store more elements
// To store more elements, reset the maxIndex to twice its size, use the temp array to
// store the elements from the factors array, and eventually assign the factors array to the temp array
// Finally, Display the factors of the number

import java.util.*;

public class Factors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		// Take the input for a number
		int number = input.nextInt();
		
		int maxFactor = 10;
		// creatig array to store factors
		int factors[] = new int[maxFactor];
		int factorsIdx = 0;
		
		
		// calculating factor of given number
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				factors[factorsIdx++] = i;
			}
			// if the arr size is full we create temp array to store the variable
			if (factorsIdx == maxFactor) {
				int tempArr[] = new int[maxFactor*2];
				for (int j = 0; j < maxFactor; j++) {
					tempArr[j] = factors[j];
				}
				factors = tempArr;
				maxFactor = maxFactor*2;
			}
		}
		
		// printing the factors
		for (int i = 0; i < maxFactor; i++) {
			if (factors[i] == 0) {
				break;
			}
			System.out.println(factors[i]);
		}
		
		input.close();
		
	}
}