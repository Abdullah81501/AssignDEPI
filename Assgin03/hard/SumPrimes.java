package hard;

public class SumPrimes {

    public static void main(String[] args) {
        int sum = 0;
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
            }
        }
        System.out.println(sum + " is the sum of prime numbers between 1 and 100");
    }
}
