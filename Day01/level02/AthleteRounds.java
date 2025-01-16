// An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
// Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
// I/P => side1, side2, side3
// O/P => The total number of rounds the athlete will run is ___ to complete 5 km

import java.util.Scanner;

class AthleteRounds {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Sides of triangle
        System.out.println("Enter the length of side1");
        double side1 = input.nextDouble();

        System.out.println("Enter the length of side2");
        double side2 = input.nextDouble();

        System.out.println("Enter the length of side3");
        double side3 = input.nextDouble();

        // Calculate  perimeter
        double perimeter = side1 + side2 + side3;

        // Convert 5 kilometers to meter
        double totalDistance = 5000;

        // Calculate rounds 
        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");

        input.close();
    }
}
