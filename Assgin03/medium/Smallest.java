package medium;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter a number : " );
		int n1  = scanner.nextInt();
		
		System.out.print("\nenter a number : " );
		int n2 = scanner.nextInt();
		
		System.out.print("\nenter a number : " );
		int n3 = scanner.nextInt();
		
		if (n1 < n2 && n1 < n3) {
			System.out.println(n1+" is the smallest");
		}else if (n2 < n1 && n2 < n3) {
			System.out.println(n2+" is the smallest");
		}else {
			System.out.println(n3+" is the smallest");
		}
		scanner.close();
		}

}
