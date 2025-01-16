import java.util.Scanner;

public class YoungestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	// Input a number
	String[] name = {"Amar", "Akbar", "Anthony"};
	int[] ages = new int[3];
	int[] heights = new int[3];

	System.out.println("Enter the age of all 3 friends: ");	
	for(int i=0; i<3; i++) {
		ages[i] = input.nextInt();
	}

	System.out.println("Enter the height of all 3 friends: ");	
	for(int i=0; i<3; i++) {
		heights[i] = input.nextInt();
	}

	int youngestIndex = 0, age = Integer.MAX_VALUE;

	for(int i=0; i<3; i++) {
		if(age > ages[i]) {
			age = ages[i];
			youngestIndex = i;
		}
	}

	int tallerIndex = 0, tallest = Integer.MIN_VALUE;

	for(int i=0; i<3; i++) {
		if(tallest < heights[i]) {
			tallest = heights[i];
			tallerIndex = i;
		}
	}

	        
	System.out.println("Youngest of three is: " + name[youngestIndex] + " and tallest of the three is: " + name[tallerIndex]);

	// closing the scanner resource
        input.close();
    }
}