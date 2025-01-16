import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	// Input a number
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	int length = String.valueOf(num).length();
	
	// Declaring the array
	int[] array = new int[length];
	length--;
	
        while(num > 0) {
		array[length--] = num % 10;
		num /= 10;
	}

	// Displaying the content of array in reverse order
	for(length = array.length-1; length >=0; length--) {
		System.out.print(array[length]);
	}

	System.out.println();

    input.close();
	
    }
}