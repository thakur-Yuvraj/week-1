import java.util.Scanner;

public class RemoveSpecific {
    public static void main(String[] args) {
	    //using scanner object to take inputs
        Scanner sc = new Scanner(System.in);

        // Taking input for the string and the character to remove
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        // Create a new string to store the result
        StringBuilder modifiedStr = new StringBuilder();

        // Iterate through the original string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {

		// Append characters that are not to be removed
                modifiedStr.append(str.charAt(i));             }
        }

        // Display the modified string
        System.out.println("Modified String: " + modifiedStr.toString());

	    //closing scanner
        sc.close();
    }
}
