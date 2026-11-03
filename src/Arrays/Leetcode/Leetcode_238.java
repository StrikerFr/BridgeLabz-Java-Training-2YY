package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Leetcode_238 solution = new Leetcode_238();
        int[] nums = {1, 2, 3, 4};
        System.out.println("Product except self: " + Arrays.toString(solution.productExceptSelf(nums)));
    }
}
