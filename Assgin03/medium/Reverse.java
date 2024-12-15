package medium;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();    // original number
        int num2 = num1;                 // copy
        int rev = 0;                     // reversed number
        
        while (num2 != 0) {
            int temp = num2 % 10;
            rev = (rev * 10) + temp;   
            num2 = num2 / 10;           
        }
        
        System.out.println("Reversed number: " + rev);
        scanner.close();
    }
}
