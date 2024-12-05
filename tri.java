// Abdullah Essam
package assignment;

import java.util.Scanner;

public class tri {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input first angle : ");
		int angle1 = scanner.nextInt();
		System.out.println("Input second angle : ");
		int angle2 = scanner.nextInt();
		System.out.println("Input third angle : ");
		int angle3 = scanner.nextInt();
		
		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("Valid triangle");
		}
		else {
			System.out.println("Invaild triangle");
		}
	}
}
