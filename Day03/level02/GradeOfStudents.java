import java.util.Scanner;

public class GradeOfStudents {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// input a number
		System.out.print("Enter the number of students: ");
		int student = input.nextInt();
	
		// Array declaration
		int[] physicsMarks = new int[student];
		int[] mathMarks = new int[student];
		int[] chemistryMarks = new int[student];
		
		// Entering the physics marks
		System.out.println("Enter physics marks of each student: ");
		for(int i=0; i<student; i++) {	
			physicsMarks[i] = input.nextInt();
		}

		// Entering the Math marks
		System.out.println("Enter math marks of each student: ");
		for(int i=0; i<student; i++) {	
			mathMarks[i] = input.nextInt();
		}

		// Entering the Chemistry marks
		System.out.println("Enter chemistry marks of each student: ");
		for(int i=0; i<student; i++) {	
			chemistryMarks[i] = input.nextInt();
		}

		float[] percentage = new float[student];
		char[] grade = new char[student];

		// Calculating percentage of each students
		for(int i=0; i<student; i++) {
			percentage[i] = (physicsMarks[i] + mathMarks[i] + chemistryMarks[i]) / 3.0f;
		}

		for(int i=0; i<student; i++) {
			if(percentage[i] >= 80) {
				grade[i] = 'A';
			} else if(percentage[i] >= 70) {
				grade[i] = 'B';
			} else if(percentage[i] >= 60) {
				grade[i] = 'C';
			} else if(percentage[i] >= 50) {
				grade[i] = 'D';
			} else if(percentage[i] >= 40) {
				grade[i] = 'E';
			} else {
				grade[i] = 'R';
			}
		}

		// output the result
		for(int i=0; i<student; i++) {
			System.out.println("Marks of student in physics, math, and chemistry are: " + physicsMarks[i] + " , " + mathMarks[i] + " , " + chemistryMarks[i] + " and the average is : " + percentage[i] + " and grade obtained is : " + grade[i]);
		}
		

		input.close();
	}
}