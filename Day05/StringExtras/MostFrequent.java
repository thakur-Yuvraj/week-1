import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
	    //Using scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Taking input for the string
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Array to store frequency of each character assuming lowercase letters
        int[] frequency = new int[256]; 

        //iterate through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Find the character with the highest frequency
        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentChar = (char) i;
            }
        }

        // Output the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

	    //scanner closed
        sc.close();
    }
}
