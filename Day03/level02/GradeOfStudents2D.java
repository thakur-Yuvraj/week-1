import java.util.Scanner;

public class GradeOfStudents2D {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// input a number
		System.out.println("Enter the number of students: ");
		int student = input.nextInt();
	
		// Array declaration
		int[][] marksOfStudent = new int[student][3];
		
		// Entering the marks of physics, math and chemistry in 2D array
		System.out.println("Enter the marks of physics, math and chemistry order of each student: ");
		for(int i=0; i<student; i++) {
			for(int j=0; j<3; j++)  {
				marksOfStudent[i][j] = input.nextInt();
			}
		}

		float[] percentage = new float[student];
		char[] grade = new char[student];

		// Calculating percentage of each students
		for(int i=0; i<student; i++) {
			int total =  0;
			for(int j=0; j<3; j++)  {
				total += marksOfStudent[i][j];
			}

			percentage[i] = total / 3.0f;
		}

		// Finding the different grade of student
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
	
		// Displaying the result of each students
		for(int i=0; i<student; i++) {
			System.out.print("Student marks in");
			for(int j=0; j<3; j++)  {
				if(j == 0) {
					System.out.print(" physics is: " + marksOfStudent[i][j]);
				} else if(j == 1) {
					System.out.print(" and math marks is: " + marksOfStudent[i][j]);
				} else {
					System.out.print(" and chemistry marks is: " + marksOfStudent[i][j]);
				}
			}

			System.out.println(" and percentage is: " + percentage[i] + " and grade obtained is: " + grade[i]);
		}
		
		input.close();
	}
}