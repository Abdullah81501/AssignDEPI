package assign02;

import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Number1 = ");
		int n1 = scanner.nextInt();
		System.out.printf("Number2 = ");
		int n2 = scanner.nextInt();
		int N1 = n1 , N2 =n2;
		while(n2 != 0) {
			int temp = n2;
			n2 = n1%n2;
			n1 = temp;
		}
		System.out.println("GCD of "+ N1 + " and " + N2 + " is "+ n1);
        scanner.close();

	}

}
