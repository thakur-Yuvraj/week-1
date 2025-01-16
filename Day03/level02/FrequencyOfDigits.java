import java.util.Scanner;

public class FrequencyOfDigits {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// input a number
		System.out.println("Enter a number: ");
		int number = input.nextInt();
	
		//  array declaration
		int[] frequency = new int[10];

		while(number > 0) {
			int num = number % 10;
			frequency[num]++;
			number /= 10;
		}

		// Printing the frequency
		for(int i=0; i<10; i++) {
			System.out.println("Frequency of: " + i + " in the given number is : " + + frequency[i]);
		}
		
		
		input.close();
	}
}