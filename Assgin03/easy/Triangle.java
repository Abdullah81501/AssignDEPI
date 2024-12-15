package easy;
// this isn't easy Muaz......
public class Triangle {

	public static void main(String[] args) {
		int j =4;
		int k = 1;
		for (int i = 0; i < 5;i++) {
			for (int a = 0 ; a <= j; a++) {
				System.out.print(" ");
			}
			for (int b = 0; b < k;b++) {
				System.out.print("*");
			}
			for (int a = 0 ; a <= j; a++) {
				System.out.print(" ");
			}
			j--;
			k+=2;
			System.out.println();

		}
	}

}
