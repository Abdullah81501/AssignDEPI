package assignment;

import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your grade : ");
		double grade = scanner.nextDouble();
		if (grade > 90) {
			System.out.println("Your grade is A+");
	}else if(grade > 80) {
			System.out.println("Your grade is A");
	}else if (grade > 70) {
			System.out.println("Your grade is B");
	}else if (grade > 60) {
			System.out.println("Your grade is C");
	}else {
			System.out.println("Your grade is F");
	}
}
}