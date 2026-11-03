package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }

    public static void main(String[] args) {
        Leetcode_1365 solution = new Leetcode_1365();
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println("Smaller numbers than current: " + Arrays.toString(solution.smallerNumbersThanCurrent(nums)));
    }
}
