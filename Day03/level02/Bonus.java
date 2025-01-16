import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	// Array declaration
	double[] salary = new double[10];
	int[] year = new int[10];

	System.out.println("Enter the salary of all ten employees: ");

	// Input the details
	for(int i=0; i<10; i++) {
		salary[i] = input.nextDouble();	
	}

	System.out.println("Enter the year of exprience of all ten employees: ");
	
	for(int i=0; i<10; i++) {
		year[i] = input.nextInt();	
	}

	double[] bonus = new double[10];
	double[] newSalary = new double[10];

	// Finding the bonus
	for(int i=0; i<10; i++)  {
		if(year[i] > 5) {
			bonus[i] = salary[i] * 5.0 / 100;
		} else {
			bonus[i] = salary[i] * 2.0 / 100;
		}

		newSalary[i] = salary[i] + bonus[i];
	}

	// Printing the details of the employees
	for(int i=0; i<10; i++)  {
		System.out.println("Salary of employee is: " + salary[i] + " bonus recieved is: " + bonus[i] + " and the total salary now is: " + newSalary[i]);
	}

	// closing the scanner resource
        input.close();
    }
}