public class UnitConverter3 {


    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9; // Conversion formula
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32; // Conversion formula
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // Conversion factor
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // Conversion factor
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541; // Conversion factor
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172; // Conversion factor
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter class methods
        double fahrenheit = 100.0;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.18;
        double gallons = 5.0;
        double liters = 20.0;

        // Convert Fahrenheit to Celsius
        double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsiusFromFahrenheit + "°C.");

        // Convert Celsius to Fahrenheit
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheitFromCelsius + "°F.");

        // Convert pounds to kilograms
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilogramsFromPounds + " kilograms.");

        // Convert kilograms to pounds
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + poundsFromKilograms + " pounds.");

        // Convert gallons to liters
        double litersFromGallons = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + litersFromGallons + " liters.");

        // Convert liters to gallons
        double gallonsFromLiters = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallonsFromLiters + " gallons.");
    }
}
