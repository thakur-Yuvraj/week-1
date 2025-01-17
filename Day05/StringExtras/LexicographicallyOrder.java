import java.util.Scanner;

public class LexicographicallyOrder {
    public static void main(String[] args) {
	    //using scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input for the two strings
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

      // Compare the two strings character by character
        int minLength = Math.min(str1.length(), str2.length());
        boolean areEqual = true;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                areEqual = false;
            if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
                } else {
                    System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
                }
                break;
            }
        }

        // If the strings are equal so far, check their lengths
        if (areEqual) {
            if (str1.length() == str2.length()) {
                System.out.println("The two strings are lexicographically equal.");
            } else if (str1.length() < str2.length()) {
             System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
            } else {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
            }
        }

	    //Closing the scanner
        sc.close();
    }
}
