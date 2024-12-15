package medium;

public class PrimeTo50 {

    public static void main(String[] args) {
        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;
            for (int i = 2; i <=num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            }
        }
    }
}
