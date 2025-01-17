
import java.util.Scanner;

class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public void calculateAreaOfCircle() {
        // Formula to calculate area of a circle = pi*r^2
        double area = Math.PI * Math.pow(radius, 2);
        System.out.print("Area of Circle with radius22 " + radius + " is " + area + "\n");
    }

    // Method to calculate Circumference of a circle
    public void calculateCircumference() {
        // Formula to calculate the Circumference 2*PI*r
        double circumference = 2 * Math.PI * Math.pow(radius, 2);
        System.out.print("Circumference of Circle with radius " + radius + " is " + circumference + "\n");
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter radius of a circle
        System.out.print("Enter radius of a circle: ");
        double radius = input.nextDouble();

        // Creating an object of a circle class
        Circle circle1 = new Circle(radius);

        // Getting the area of circle
        circle1.calculateAreaOfCircle();
        // Getting the circumference of a circle
        circle1.calculateCircumference();

        input.close();
    }

}
