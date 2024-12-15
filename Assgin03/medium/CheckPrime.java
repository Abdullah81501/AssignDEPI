package medium;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		
		boolean prime  = true;
		
		for (int i = 2; i < (num/2);i++) {
			if (num%i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" isn't a prime number");
		}
		scanner.close()
;	}

}
