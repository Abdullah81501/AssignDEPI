package medium;

import java.util.Scanner;
public class Patterndec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		
		for (int j = 0 ; j < num ;j++) {
			for (int i = 1 ; i <= (num-j);i++ ) {
				System.out.print (i);
			}
			System.out.println("");
		}
		scanner.close();
	}

}
