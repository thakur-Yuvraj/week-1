public class ReplaceGivenWord {
    //using method for remove duplicates
    public static String removeDuplicates(String str,StringBuilder s){
        str = str.toLowerCase();
        int arr[] = new int[26];

        for(int i = 0; i < str.length(); i++){
            if(arr[(int)str.charAt(i) - 97] == 0) {
            arr[(int)str.charAt(i) - 97]++;
            s.append(str.charAt(i));
            }else{
                continue;
            }
        }
        
        return s.toString();
    }
	
	public static void main(String[] args){
        String str = "Shivam";
        System.out.println("Enter the string to remove duplicates - ");
        StringBuilder s = new StringBuilder();

        //call the removeDuplicates method and store the result
        String result = removeDuplicates(str,s);

        // Print the string without duplicates
        System.out.println("String after removing duplicates: " + result);
    }
}
