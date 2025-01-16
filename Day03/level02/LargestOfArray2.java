import java.util.Scanner;

public class LargestOfArray2 {
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


import java.util.Scanner;

public class LargestOfArray2 {
    public static void main(String[] args) {
		// Creating the scanner object
		Scanner input = new Scanner(System.in);
		
		// Taking a number
		System.out.println("Enter the number greater than 9: ");
		long number = input.nextLong();
		
		// store number of digits
		int maxDigits = 10; 
		long tempNumber = number;
			
		//size of array needs to be equal to the numberOfDigits
		int digits[] = new int[maxDigits];
		int index = 0; //Array index
			
		//Storing digits in array		
		while(tempNumber > 0){
			if(index == maxDigits){
				int temp[] = new int[maxDigits * 2];
				for(int i=0; i<maxDigits; i++){
					//copying array
					temp[i] = digits[i]; 
				}
				
				//pointing to new array
				digits = temp;   
			}
				
			digits[index] = (int)tempNumber%10;
			tempNumber /= 10;
			index++;
		}
		
		//Largest and Second largest
		int largest = 0;
		int secondLargest = 0;
		
		for(int i=0; i<index; i++){ 
			if(digits[i] > largest){
				secondLargest = largest;
				largest = digits[i];
			}
			if(digits[i] > secondLargest && digits[i] < largest){
				secondLargest = digits[i];
			}
		}
		
		// Printing the result
		System.out.println("Largest number is: " + largest + " , and " + "Second Largest is: " + secondLargest);

		// closing the scanner resource
        input.close();
    }
}