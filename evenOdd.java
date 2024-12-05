package assignment;
import java.util.Scanner;

public class evenOdd {
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("input number : ");
	int N = scanner.nextInt();
	
	int NAbs = Math.abs(N); 
	if (N%2 == 0) {
		System.out.println(N+" is Even");
	}else {
		System.out.println(N+ " is Odd"); 
	}
	}
}
