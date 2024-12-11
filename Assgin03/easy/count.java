package easy;
import java.util.Scanner;
class count {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int x = scanner.nextInt();
		int i= 0,temp = x;
		while(x != 0) {
			i++;
			x /=10;
		}
		System.out.println(temp+" has "+i+" digits");
		
		scanner.close();
	}
}
