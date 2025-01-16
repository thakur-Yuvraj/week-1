import java.util.Scanner;

public class LargestOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	// Input a number
	System.out.println("Enter the size of the array: ");
	int size = input.nextInt();
	
	// Declaring the array
	int[] array = new int[size];
	
	// Input the elements of the array
	for(int i=0; i<size; i++) { 
		array[i] = input.nextInt();
	}

	int largest = 0, secondLargest = 0;

	// Finding the largest of the array
	for(int i=0; i<size; i++) {
		if(largest < array[i]) largest = array[i];
	}

	// Finding the second Largest of the array
	for(int i=0; i<size; i++) {
		if(secondLargest < array[i] && array[i] != largest) secondLargest = array[i];
	}
        
	System.out.println("The largest one is: " + largest + " and second largrst is: " + secondLargest);

        input.close();
    }
}