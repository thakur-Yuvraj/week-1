// Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators

import java.util.Scanner;

public class LeapYearSingleIfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year less than or equal to 1582 ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } 
        else {
            System.out.println(year + " is not a Leap Year");
        }

        input.close();
    }
}