package hard;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = scanner.nextInt();
		
		while (n > 1) {
			if (n % 2 == 0) {
				n /=2;
			}
			else {
				n = 3*n+1;
			}
			System.out.println(n);
		}
		scanner.close();
	}

}
