// Write a program that takes a year as input and outputs the Year is a Leap Year or not 
// Hint => 
// The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
// Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
// Write a method to check for Leap Year using the conditions a and b


import java.util.Scanner;

public class LeapYearChecker {

    
    public static boolean isLeapYear(int year) {
        
        if (year >= 1582) {
            // Leap year conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;  // It is a leap year
            } else {
                return false;  // It is not a leap year
            }
        } else {
            System.out.println("The year must be 1582 or later in (Gregorian calendar).");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input year 
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
		// Method to check if a given year is a leap year
        boolean isLeap = isLeapYear(year);

        // Display the result
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
