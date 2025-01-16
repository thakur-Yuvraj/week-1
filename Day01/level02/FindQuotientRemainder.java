// Write a program to take 2 numbers and print their quotient and reminder
// Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
// I/P => number1, number2
// O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___


import java.util.Scanner;

class FindQuotientRemainder{

	public static void main(String args[]){


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number1");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		//Calculate Quotient
		int quotient = number1/number2;
		
		//Calculate Remainder
		int remainder = number1%number2;	

		//Output Result
		System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two number "+number1+" and "+number2);	

		input.close();
	}

}