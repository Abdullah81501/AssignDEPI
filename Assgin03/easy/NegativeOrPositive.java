package easy;

import java.util.Scanner;

public class NegativeOrPositive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		double num = scanner.nextDouble();
		
		if (num > 0) {
			System.out.println(num+" is a positive number");
		}else if (num < 0) {
			System.out.println(num+" is a negative number");
		}else {
			System.out.println(num +"is Zero");
		}
		scanner.close();
	}

}
