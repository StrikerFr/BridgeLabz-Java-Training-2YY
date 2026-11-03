package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0, right = n - 1, i = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i--] = nums[left] * nums[left];
                left++;
            } else {
                res[i--] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode_977 solution = new Leetcode_977();
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println("Sorted squares: " + Arrays.toString(solution.sortedSquares(nums)));
    }
}
