
// Create a program to find the total income of a person by taking salary and bonus from user
// Hint => 
// Create a variable named salary and take user input.
// Create another variable bonus and take user input.
// Compute income by adding salary and bonus and print the result
// I/P => salary, bonus
// O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___



import java.util.Scanner;

class Income {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        System.out.println("Enter your bonus");
        double bonus = input.nextDouble();

        // Calculate
        double totalIncome = salary + bonus;

        // Output
        System.out.printf("The salary is INR "+salary+" and bonus is INR"+bonus+". Hence Total Income is INR "+totalIncome);

        
        input.close();
    }
}
