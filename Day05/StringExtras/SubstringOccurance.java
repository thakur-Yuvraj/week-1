import java.util.Scanner;

public class SubstringOccurance {
    //using method for counting the occurence
    public static int countOccurrence(String str, String substring) {
        int count = 0; 

        for (int i = 0; i <= str.length() - substring.length(); i++) { 
            boolean isPresent = true;
            for (int j = 0; j < substring.length(); j++) {
                  if (substring.charAt(j) != str.charAt(i + j)) {
                    isPresent = false;
                    break;}
            }
            if (isPresent) {
                count++; 
            }
        }

        //return the final count
        return count; 
    }

    public static void main(String[] args) {
        // using scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        //take input from user
        System.out.println("Enter the string - ");
        String str = sc.nextLine();

        System.out.println("Enter the substring ");
        String substring = sc.nextLine();

        int count = countOccurrence(str, substring);
        System.out.println("A given substring is occurring - " + count + " time in a string.");

        //scanner closed
        sc.close();
    }
}
