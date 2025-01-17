import java.util.Arrays;
import java.util.Scanner;

public class FindingAnagram {
    public static void main(String[] args) {
	    //using scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input for the two strings
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert both strings to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            // Convert strings to character arrays
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            // Sort the arrays
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            // Compare the sorted arrays
            if (Arrays.equals(str1Array, str2Array)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

	    //scanner closed
        sc.close();
    }
}
