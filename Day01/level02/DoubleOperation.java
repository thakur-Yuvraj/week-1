// Similarly, write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;

class DoubleOperation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // values a, b, and c
        System.out.println("Enter value for a:");
        double a = input.nextDouble();

        System.out.println("Enter value for b:");
        double b = input.nextDouble();

        System.out.println("Enter value for c:");
        double c = input.nextDouble();

        // performing Operations
        double result1 = a + b * c; 
        double result2 = a * b + c;  
        double result3 = c + a / b;  
        double result4 = a % b + c;  

        // Output
        System.out.println("Result of a + b * c: " + result1);
        System.out.println("Result of a * b + c: " + result2);
        System.out.println("Result of c + a / b: " + result3);
        System.out.println("Result of a % b + c: " + result4);

        input.close();
    }
}
