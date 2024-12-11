package assign02;

import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number (N): ");
        int N = scanner.nextInt();

        while (N != 1) {
            System.out.print(N + " ");
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N = 3 * N + 1;
            }
        }

        System.out.print(1);
        scanner.close();
    }
}
