// Rewrite the program 5 FizzBuzz using while loop 



import java.util.Scanner;

public class FizzBuzzWithWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get the upper limit for FizzBuzz from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int i = 1;

        while (i <= number) {
            // Check for multiples of 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            // Increment the counter
            i++;
        }

        
        input.close();
    }
}
