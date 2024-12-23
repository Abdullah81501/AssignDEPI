package medium;

public class Found {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 3, 9, 2};
        int target = 3;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println("Number " + target + (found ? " exists." : " does not exist."));
    }
}
