// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for the age and height of the 3 friends and store it in a variable
// Find the smallest of the 3 ages to find the youngest friend and display it
// Find the largest of the 3 heights to find the tallest friend and display it


import java.util.Scanner;

public class YoungestAndTallest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Amar data
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = input.nextInt();

        // Akbar data
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = input.nextInt();

        // Anthony data
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = input.nextInt();

        // Finding the youngest friend 
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Finding the tallest friend by comparing heights
        int tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Display the res
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge + " years\n"+ "The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");

        input.close();
    }
}

