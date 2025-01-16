// Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
// Hint => 
// Create variables a, b, c of int data type.
// Take user input for a, b, and c.
// Compute 3 integer operations and assign result to a variable
// Finally print the result and try to understand operator precedence.
// I/P => fee, discountPrecent
// O/P => The results of Int Operations are —-, -—, and —-


import java.util.Scanner;

class IntOperation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // values a, b, and c
        System.out.println("Enter value for a");
        int a = input.nextInt();

        System.out.println("Enter value for b");
        int b = input.nextInt();

        System.out.println("Enter value for c");
        int c = input.nextInt();

        // performing Operations
        int result1 = a + b * c; 
        int result2 = a * b + c;  
        int result3 = c + a / b;  
        int result4 = a % b + c;  

        // Output
        System.out.println("Result of a + b * c " + result1);
        System.out.println("Result of a * b + c " + result2);
        System.out.println("Result of c + a / b " + result3);
        System.out.println("Result of a % b + c " + result4);

        
        input.close();
    }
}
