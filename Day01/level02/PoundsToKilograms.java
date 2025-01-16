// Create a program to convert weight in pounds to kilograms.
// Hint => 1 pound = 2.2 kg
// I/P => weight
// O/P => The weight of the person in pound is ___ and in kg is ___



import java.util.Scanner;

public class PoundsToKilograms {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // weight input
        System.out.print("Enter weight in pounds ");
        double pounds = input.nextDouble();

        // Convert pounds to kilo
        double kilograms = pounds * 2.2;

        // Output
        System.out.printf("The weight of the person in pound is "+pounds+" and in kg is "+kilograms);

        input.close();
    }
}
