package medium;

public class Armstrongto500 {
    public static void main(String[] args) {
        for (int i = 1;i <= 500;i++) {
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

        }

    }
}
