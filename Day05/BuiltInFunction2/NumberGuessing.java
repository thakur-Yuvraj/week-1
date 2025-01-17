import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        int userGuess = generateUserGuess();
        int computerGuess = getNextGuess();

        getUserFeedback(userGuess, computerGuess);
    }

    private static int generateUserGuess() {
        // Taking the input of number from user as a guess
        System.out.println("Guess the number between 1 and 100: ");
        // Defining the scanner object
        Scanner input = new Scanner(System.in);
        // Taking the input of a number
        int number = input.nextInt();

        // Closing the scanner object
        input.close();

        // Returning the number
        return number;
    }

    private static void getUserFeedback(int userGuess, int computerGuess) {
        while(true) {
            if(userGuess == computerGuess) {
                System.out.println("Correct.");
                break;
            } else if(userGuess > computerGuess) {
                System.out.println(computerGuess + " is Low than " + userGuess);
            } else {
                System.out.println(computerGuess + " is high than " + userGuess);
            }

            computerGuess = getNextGuess();
        }
    }

    private static int getNextGuess() {
        // Getting the random object
        Random random = new Random();
        // Generating the computer guess between 1 and 100
        int number = random.nextInt(100);

        // Returning the guessed number
        return number;
    }
}
