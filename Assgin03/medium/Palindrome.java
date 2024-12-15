package medium;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int Num = scanner.nextInt();
        int ogNum = Num;					//copy
        int revNum = 0;						//reversed
        
        while (Num != 0) {
            int x = Num % 10;
            revNum = revNum * 10 + x;
            Num /= 10;
        }
        if (ogNum == revNum) {
            System.out.println(ogNum + " is a palindrome.");
        } else {
            System.out.println(ogNum + " is not a palindrome.");
        }
        scanner.close();
    }
}