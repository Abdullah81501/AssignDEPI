package hard;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= (n/2);i++) {
			if (n%i == 0) {
				System.out.print(i+"\t");
			}
		}
		scanner.close();
	}

}
