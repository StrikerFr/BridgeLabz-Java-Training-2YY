package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Leetcode_1929 solution = new Leetcode_1929();
        int[] nums = {1, 2, 1};
        System.out.println("Concatenation: " + Arrays.toString(solution.getConcatenation(nums)));
    }
}
