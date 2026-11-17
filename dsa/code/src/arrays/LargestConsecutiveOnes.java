package arrays;

public class LargestConsecutiveOnes {
    public static void main(String[] args) {
        int[] input = {0, 1, 1, 1, 1, 0, 0, 1, 1};
        int max = 0;
        int current = 0;
        for (int i : input) {
            if (i == 1) {
                current++;
                max = Math.max(current, max);
            } else {
                current = 0;
            }
        }
        System.out.println(max);
    }
}
