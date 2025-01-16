// Write a program to demonstrate NullPointerException. 
// Hint => 
// Write a Method to generate the Exception. Here define the variable text and initialize it to null.
// Then call one of the String Method to generate the exception
// Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null.
// Then write try catch block for handling the Exception while accessing one of the String method
// From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException


public class NullPtrException {
	public static void demonstrateException(String string) {
		try {
		int length = string.length();
		}
		catch(NullPointerException e) {
			// System.out.println(e.printStackTrace());
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		// creating a text string 
		String txt = null;
		
		// method to run string method to get exception
		demonstrateException(txt);
		
	}
}