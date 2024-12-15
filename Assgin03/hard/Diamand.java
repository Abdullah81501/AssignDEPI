package hard;

public class Diamand {

    public static void main(String[] args) {
        int j = 4;
        int k = 1;

        // Upper part of the diamond
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < j; a++) {
                System.out.print(" ");
            }
            for (int b = 0; b < k; b++) {
                System.out.print("*");
            }
            for (int a = 0; a < j; a++) {
                System.out.print(" ");
            }
            j--;
            k += 2;
            System.out.println();
        }

        j = 1;
        k = 7;

        // Lower part of the diamond
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < j; a++) {
                System.out.print(" ");
            }
            for (int b = 0; b < k; b++) {
                System.out.print("*");
            }
            for (int a = 0; a < j; a++) {
                System.out.print(" ");
            }
            j++;
            k -= 2;
            System.out.println();
        }
    }
}
