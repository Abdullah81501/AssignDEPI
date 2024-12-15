package hard;

import java.util.Scanner;

public class binToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a binary number: ");
        int binaryNumber = scanner.nextInt();
        int displaynumber = binaryNumber;

        int decimalNumber = 0; 
        int base = 1; 

        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10; 
            decimalNumber += lastDigit * base; 
            binaryNumber /= 10;                
            base *= 2;
        }

        System.out.println(displaynumber +" = " + decimalNumber);
        scanner.close();
    }
}

