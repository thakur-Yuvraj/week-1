// import java.util.Random;

public class RandomNumberStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];

        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
		 // (int) (Math.random() * 9000) + 1000;
        return randomNumbers;
    }

    // Method to calculate average, min, and max values from the array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = sum / numbers.length;

        // Return results in an array: [average, min, max]
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the average, min, and max of the array
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum Value: " + (int)results[1]);
        System.out.println("Maximum Value: " + (int)results[2]);
    }
}
