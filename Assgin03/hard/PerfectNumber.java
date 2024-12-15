package hard;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= (n/2);i++) {
			if (n%i == 0) {
				sum += i;
			}
		}
		if (n == sum) {
			System.out.println(n+" is a perfect number!");
		}else {
			System.out.println(n+" isn't a perfect number!");
		}
		scanner.close();
	}

}
