// Write a program SpringSeason that takes two int values month
 // and day from the command line and prints “Its a Spring Season”
 // otherwise prints “Not a Spring Season”. 
// Hint => Spring Season is from March 20 to June 20.
 // Write a Method to check for Spring season and return a
 // boolean true or false 
 
 
import java.util.Scanner;

public class SpringSeason {
	
	public static boolean isSpring(int month, int day) {
		// calculating the season
		// checking month
		if (month > 3 && month < 6) {
			return true;
		}
		// checking day
		if (month == 3 && day >= 20) {
			return true;
		}
		if (month == 6 && day <= 20) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter month and day");
		int month = input.nextInt();
		int day = input.nextInt();
		
		// calling the function
		boolean isSpringSeason = SpringSeason.isSpring(month, day);
		
		// output the result
		if (isSpringSeason) {
			System.out.println("Its a Spring Season");
		}else {
			System.out.println("Its not a Spring Season");
		}
		
		input.close();
		
	}
}