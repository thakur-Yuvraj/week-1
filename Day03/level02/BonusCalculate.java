// Create a program to find the bonus of 10 employees based on their years of service and the total
// bonus amount the company Zara has to pay, along with the old and new salary.
// Hint => 
// Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years
// or 2% if less than 5 years
// Define a double array to save salary and years of service for each of the 10 employees
// Also define a double array to save the new salary and the bonus amount as well as variables
// to save the total bonus, total old salary, and new salary
// Define a loop to take input from the user. If salary or year of service is an invalid
// number then ask the use to enter again. Note in this case you will have to decrement the index counter
// Define another loop to calculate the bonus of 10 employees based on their years of service.
// Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus
// and total old and new salary can be calculated in the loop
// Print the total bonus payout as well as the total old and new salary of all the employees


import java.util.*;

public class BonusCalculate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// number of employees in service
		int noOfEmployee = 10;
		// creating 3 double arrays
		double salaryEmployee[] = new double[noOfEmployee];
		double yearsOfService[] = new double[noOfEmployee];
		
		double salaryEmployeeBonus[] = new double[noOfEmployee];
		
		// taking input
		for (int i = 0; i < salaryEmployee.length; i++) {
			System.out.println("Enter salary and yearsOfService");
			salaryEmployee[i] = input.nextDouble();
			yearsOfService[i] = input.nextDouble();
			
			// if the input is incorrect
			if (salaryEmployee[i] < 0 || yearsOfService[i] < 0) {
				System.out.println("Invald enter again");
				i--;
			}
		}
		// adding the bonus
		for (int i = 0; i < salaryEmployee.length; i++) {
			if (yearsOfService[i] >= 5) {
				salaryEmployeeBonus[i] = salaryEmployee[i] + (salaryEmployee[i] * 5.0 / 100.0);
			}else {
				salaryEmployeeBonus[i] = salaryEmployee[i] + (salaryEmployee[i] * 2.0 / 100.0);
			}
		}
		// printing the old and new salary of emloyee
		for (int i = 0; i < salaryEmployee.length; i++) {
			System.out.println("old salary of employee "+ i + " is :"+ salaryEmployee[i]+
								"  New salary of employee "+ i + " is :"+ salaryEmployeeBonus[i]
								+ "  Bonus is :"+ (salaryEmployeeBonus[i] - salaryEmployee[i]));
		}
		input.close();
		
	}
}