// Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
// Hint => 
// Create a celsius variable and take the temperature as user input
// Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
// I/P => celcius
// O/P =>  The ____ celsius is _____ fahrenheit


import java.util.Scanner;

class TemperatureConversion {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // input from user for the temperature in Celsius
        System.out.println("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The "+celsius+" celsius is "+fahrenheitResult+" fahrenheit");

        input.close();
    }
}
