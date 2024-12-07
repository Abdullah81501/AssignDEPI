package assign02;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter a Number : ");
		int N = scanner.nextInt();
		int i = 0;					//What you add
		int Sum = 0;				// total
		while (i <= N) {
			Sum += i;
			i += 2;
		}
		System.out.println("Sum of even numbers lower than "+ N +" is : "+Sum);
        scanner.close();
	}

}
