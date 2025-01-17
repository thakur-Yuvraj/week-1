import java.util.Scanner;

public class LongestWord {
    	//using method for finding the longest word 
    public static String longestWord(String str){
        String[] st = str.split(" ");
        String maxLength = st[0];
        
        for(int i = 0; i < st.length; i++){
        if(st[i].length() > maxLength.length()){
        maxLength = st[i];
        }
        }
        //return the longest word
        return maxLength; 
    }

    public static void main(String[] args){
        //using scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to find the longest word - ");
        String str = sc.nextLine();

            String word = longestWord(str);
        //displaying result
        System.out.println("The longest word in this string is - " + word);

        //closing scanner
        sc.close();
	}
}
