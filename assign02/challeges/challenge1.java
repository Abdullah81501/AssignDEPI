package assign02;

import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int i = 1;

        while (i <= N) {
            int num = i;
            int sum = 0;
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i+"\t");
            }

            i++;
        }

        scanner.close();
    }
}
