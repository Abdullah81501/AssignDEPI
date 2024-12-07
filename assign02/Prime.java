package assign02;
// Abdullah Essam
import java.util.Scanner;
public class Prime {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter a positive number : ");
		int N = scanner.nextInt();
		int i = 2; 											// what you divide by
		boolean prime = true;
		
		if (N <= 1) {
			System.out.println(N + " is a prime number");
		}
		while (i <= N/2) {
			if (N % i == 0) {
				prime = false;
				break;
			}
			i++;
		}
		if(prime) {
			System.out.println(N + " is a prime number");
		}else {
			System.out.println(N + " is not a prime number");
		}
        scanner.close();

	}
}
