package String_01.Leetcode;

import java.util.Arrays;

public class Leetcode_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }

        return ans;
    }

    public static void main(String[] args) {
        Leetcode_1470 solution = new Leetcode_1470();
        int[] nums = {2, 5, 1, 3, 4, 7};
        System.out.println("Shuffled array: " + Arrays.toString(solution.shuffle(nums, 3)));
    }
}
