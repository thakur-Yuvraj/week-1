// Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 
// 2D Array into a single dimension array
// Hint => 
// Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
// Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns
//  as in int[] array = new int[rows * columns];
// Define the index variable and Loop through the 2D array. Copy every element of the 2D array into
// the 1D array and increment the index
// Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows,
// and the inner for loops to access each element

import java.util.*;

public class MultiToSingleDimensionArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter rows and columns of 2d array");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		// creating 2D array 
		int array2D[][] = new int[rows][columns];
		
		// taking input and storing it in 2d array
		System.out.println("Enter values in 2d array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array2D[i][j] = input.nextInt();
			}
		}
		
		// creating 1D array from rows*columns (product)
		int[] array = new int[rows * columns];
		int arrayIdx = 0;
		
		// cloning the 2d array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[arrayIdx++] = array2D[i][j];
			}
		}
		// printing the 1d array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		input.close();
		
	}
}