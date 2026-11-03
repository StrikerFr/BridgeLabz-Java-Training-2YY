package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        Leetcode_215 solution = new Leetcode_215();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("2nd largest: " + solution.findKthLargest(nums, k));
    }
}
