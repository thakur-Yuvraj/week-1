import java.util.Scanner;

public class VowelsAndConsonants {
    public static int[] count(String str){
        //converting the string into lowercase
        str = str.toLowerCase();
        
	    //initially the count for vowels and consonant is zero
        int vowelCount = 0, consonantCount = 0;

        //loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           //checking if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
           //checking if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        //return the counts as an array
        return new int[]{vowelCount, consonantCount};
	}

    public static void main(String[] args){
        //using scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        //TAKING STRING AS INPUT
        System.out.println("Enter the string - ");
        String str = sc.next();

        //call the method to count vowels and consonants
            int[] counts = count(str);

        //display the results
            System.out.println("The number of vowels are - " + counts[0]);
            System.out.println("The number of consonants are - " + counts[1]);

        //Closing the scanner
        sc.close();
    }
}
