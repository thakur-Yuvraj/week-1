// Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
// Hint => 
// Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
// Write a Method to find the youngest of the 3 friends
// Write a Method to find the tallest of the 3 friends


import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest among the three friends
    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        // Compare ages to find the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }

        return youngestFriend;
    }

    // Method to find the tallest among the three friends
    public static String findTallest(double[] heights, String[] names) {
        double tallestHeight = heights[0];
        String tallestFriend = names[0];

        // Compare heights to find the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store names, ages, and heights of the three friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for the names, ages, and heights of the three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter the height of " + names[i] + " in centimeters: ");
            heights[i] = input.nextDouble();
        }

        // Find the youngest and tallest friends using the methods
        String youngestFriend = findYoungest(ages, names);
        String tallestFriend = findTallest(heights, names);

        // Display the results
        System.out.println("\nThe youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        input.close();
    }
}
