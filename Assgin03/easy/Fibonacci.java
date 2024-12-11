package easy;
 // this isn't easy muaz......
public class Fibonacci{
    public static void main(String[] args) {
        System.out.println("First 5 Fibonacci Numbers: ");
        int first = 0, second = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
