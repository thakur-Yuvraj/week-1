import java.util.Scanner;

public class FrequecyOfDigits {
	public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);

		// input a number
		System.out.println("Enter a number: ");
		int number = input.nextInt();
	
		// 1D array declaration
		int[] frequency = new int[10];

		while(number > 0) {
			int num = number % 10;
			frequency[num]++;
			num /= 10;
		}

		// Printing the frequency
		for(int i=0; i<10; i++) {
			System.out.println("Frequency of: " + i + " in the given number is : " + + frequency[i]);
		}
		
		// Closing scanner object
		input.close();
	}
}