import java.util.Scanner;

public class NumberCheck {

    // Method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create an array to hold 5 numbers
        int[] numbers = new int[5];

        // Get user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.println(num + " is positive.");
                if (isEven(num)) {
                    System.out.println(num + " is even.");
                } else {
                    System.out.println(num + " is odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int result = compare(first, last);

        if (result == 1) {
            System.out.println("The first number " + first + " is greater than the last number " + last );
        } else if (result == 0) {
            System.out.println("The first number " + first + " is equal to the last number (" + last );
        } else {
            System.out.println("The first number " + first + " is less than the last number (" + last);
        }

        input.close();
    }
}
