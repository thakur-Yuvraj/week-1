// Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number, if not exit
// Write a Method to find the sum of n natural numbers using recursion
// Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
// Compare the two results and print the result


import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;  // Base case: natural number starts with 1
        } else {
            return n + recursiveSum(n - 1);  // Recursive step
        }
    }

    // Method to find the sum of n natural numbers using the formula
    public static int formulaSum(int n) {
		// Sum formula n * (n + 1) / 2
		int sumOfNatural = (n * (n + 1)) / 2;
        return sumOfNatural;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();

        // Validate if the input is a natural number
        if (n <= 0) {
            System.out.println("Not a positive integer");
            System.exit(0);  // Exit if not a valid natural number
        }

        // Calculate the sum using recursion
        int sumRecursive = recursiveSum(n);

        // Calculate the sum using the formula
        int sumFormula = formulaSum(n);

        // Display both results
        System.out.println("Sum of first " + n + " natural numbers (using recursion): " + sumRecursive);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + sumFormula);

        // Compare the two results
        if (sumRecursive == sumFormula) {
            System.out.println("Both results are correct and match");
        } else {
            System.out.println("The results do not match");
        }

        scanner.close();
    }
}
