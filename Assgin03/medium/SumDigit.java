package medium;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter  number : ");
		int num = scanner.nextInt();
		int sum = 0;
		
		while (num != 0) {
			int temp = num%10;
			num /= 10;
			sum += temp;
		}
		System.out.println("Sum = "+ sum);
		scanner.close();
	}

}
