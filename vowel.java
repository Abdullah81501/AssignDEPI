// Abdullah Essam
package assignment;

import java.util.Scanner;

public class vowel {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input letter");
		char ch = scanner.nextLine().charAt(0);
		if(!Character.isLetter(ch)) {
			System.out.println("ERROR! only enter letters");
		}
		else if (ch == 'a' || ch == 'A' ||ch == 'e'||ch == 'E'||ch == 'i'||ch == 'I'||ch == 'o'||ch == 'O'||ch == 'u'||ch == 'U') {
			System.out.println("Letter is vowel");
		}else {
			System.out.println("Letter is constant");
		}
		
	}
}
