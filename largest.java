// Abdullah Essam
package assignment;

import java.util.Scanner;

public class largest {
		//largest of three
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input first number");
		int n1 = scanner.nextInt();
		System.out.println("input second number");
		int n2 = scanner.nextInt();
		System.out.println("input third number");
		int n3 = scanner.nextInt();
		 
		if (n1 > n2 && n1 > n3 ) {
			System.out.println(n1 + " is the largest");
		}
		if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is the largest");
		}
		if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " is the largest");
		}
}
}
