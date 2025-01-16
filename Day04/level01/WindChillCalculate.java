// Write a program calculate the wind chill temperature given
// the temperature and wind speed
// Hint => 
// Write a method to calculate the wind chill temperature
// using the formula 
// windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
// public double calculateWindChill(double temperature, double windSpeed)

import java.util.Scanner;

public class WindChillCalculate {
	
	public static double calculateWindChill(double temp, double windSpeed) {
		// using the formula 
		// windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16
		double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed, 0.16);
		
		return windChill;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature and windSpeed");
		double temp = input.nextDouble();
		double windSpeed = input.nextDouble();
		
		// calling the calculateWindChill method
		double windChill = WindChillCalculate.calculateWindChill(temp, windSpeed);
		
		// printing the windChill Temperature
		System.out.println("The windChill Temperature is :"+ windChill);
		
		input.close();
		
	}
}