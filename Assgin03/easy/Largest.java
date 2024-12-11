package easy;

import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter a number : ");
			double a = scanner.nextDouble();
			
			System.out.print("Enter a number : ");
			double b = scanner.nextDouble();
			
			if (a > b) {
				System.out.println(a+" is bigger than "+b);
			}else {
				System.out.println(b+" is bigger than "+a);
			}
			scanner.close();
			}

}
