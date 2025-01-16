
// Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
// Hint => 
// Take a, b, and c as input values to find the roots of x.
// The roots are computed using the following formulae
// delta = b2+ 4*a*c
// If delta is positive the find the two roots using formulae 
// root1 of x = (-b + delta)/(2*a) 
// root1 of x = (-b - delta)/(2*a)
// If delta is zero then there is only one root of x  
// root of x = -b/(2*a)
// If delta is negative return empty array or nothing 
// Write a Method to find find the roots of a quadratic equation and return the roots



import java.util.Scanner;

public class QuadraticEquation {

    // Method to find the roots of the quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // If delta is negative, return an empty array (no real roots)
        if (delta < 0) {
            return new double[0]; // No real roots
        }

        // If delta is zero, there is one real root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta is positive, there are two real roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the coefficients a, b, and c
        System.out.print("Enter a b c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Finding the roots using the findRoots method
        double[] roots = findRoots(a, b, c);

        // Display the roots 
        if (roots.length == 0) {
            System.out.println("No real roots exist ");
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }

        
        input.close();
    }
}
