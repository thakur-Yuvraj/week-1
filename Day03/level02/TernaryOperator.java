import java.util.*;

public class temp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three nums :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int answer = a>b? a>c? a : b>c? b: c : b>c? b:c;
		System.out.println(answer);
		input.close();
		
	}
}