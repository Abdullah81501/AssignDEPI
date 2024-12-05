package assignment;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input first number : ");
		int n1 = scanner.nextInt();
		System.out.println("Input second number : ");
		int n2 = scanner.nextInt();
		
		System.out.println("Choose opration :\n1) "+n1+" + "+n2+"\n2) "+n1+" - "+n2+"\n3) "+n1+" * "+n2+"\n4) "+n1+" / "+n2);
		int op = scanner.nextInt();
		
		if (op == 1) {
			System.out.println(n1+" + "+n2+" = "+(n1 + n2));
		}
		else if (op == 2) {
			System.out.println(n1+" - "+n2+" = "+(n1 - n2));
		}
		else if (op == 3) {
			System.out.println(n1+" * "+n2+" = "+(n1 * n2));
		}
		else if (op == 4) {
			System.out.println(n1+" / "+n2+" = "+(n1 / n2));
		}
	}

}
