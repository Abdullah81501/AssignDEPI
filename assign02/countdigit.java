package assign02;

import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number > 0);

        System.out.println("The number has " + count + " digits.");
        scanner.close();
    }
}
