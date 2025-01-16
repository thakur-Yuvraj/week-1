// Create a program to find the factors of a number taken as user input,
// store the factors in an array and display the factors. Also find the sum,
// sum of square of factors and product of the factors and display the results
// Hint => 
// Take the input for a number
// Write a static Method to find the factors of the number and save them in an
// array and return the array. 
// To find factors and save to array will have two loops. The first loop to find
// the count and initialize the array with the count. And the second loop save the
// factors into the array
// Write a method to find the sum of the factors using factors array
// Write a method to find the product of the factors using factors array
// Write a method to find the sum of square of the factors using Math.pow() method

import java.util.Scanner;

public class FactorOperations{

    // Method to find factors of the number and return them in an array
    public static int[] findFactors(int number) {
        int[] factors = new int[number];
		// Counter to keep track of number of factors
        int count = 0;  
        
        // Loop through all numbers from 1 to the given number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count++] = i; // Store factor in array
            }
        }
        
        // Resize the array to fit the actual number of factors
        int[] result = new int[count];
        System.arraycopy(factors, 0, result, 0, count);
        return result;
    }

    // Method to calculate the sum of the factors
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of the factors
    public static long calculateSumOfSquares(int[] factors) {
        long sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();
        
        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors of " + number + " are: ");
		
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
		// for newline and seperation
        System.out.println();
		

        // Calculate and display sum of factors
        int sum = calculateSum(factors);
        System.out.println("Sum of factors: " + sum);
		

        // Calculate and display product of factors
        long product = calculateProduct(factors);
        System.out.println("Product of factors: " + product);

        // Calculate and display sum of squares of factors
        long sumOfSquares = calculateSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        
        input.close();
    }
}
