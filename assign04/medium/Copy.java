package medium;

public class Copy {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        int[] copiedArr = {0, 0, 0, 0, 0};
        
        for (int i = 0; i < arr.length; i++) {
            copiedArr[i] = arr[i];
        }

        for (int i = 0; i < copiedArr.length; i++) {
            System.out.print(copiedArr[i] + " ");
        }
    }
}
