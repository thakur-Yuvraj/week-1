import java.util.Scanner;

public class StringReverse {
    public static String reverseString(String str) {
        String reversed = " ";

        //looping through the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {   
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

	public static void main(String[] args){
        //using scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        //TAKING STRING AS INPUT
        System.out.println("Enter the string - ");
        String str = sc.nextLine();

        //calling the reverseString method
        String reverse = reverseString(str);

        System.out.println("Reverse of the string - " + reverse);

        //closing the scanner
        sc.close();
    }
}
