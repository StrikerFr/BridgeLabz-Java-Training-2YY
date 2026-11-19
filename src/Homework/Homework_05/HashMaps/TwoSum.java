package Homework.Homework_05.HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem 5 (Hash Maps): Two Sum Problem
 *
 * Description: Given an array and a target sum, find two indices such that
 * their values add up to the target.
 *
 * Approach:
 * - Use a HashMap to store element values as keys and their 0-based indices as values.
 * - For each element at index i, compute complement = target - nums[i].
 * - If complement exists in map, return indices {map.get(complement), i}.
 * - Otherwise, record nums[i] -> i in map.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 5: Two Sum Problem ===");

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] indices1 = twoSum(nums1, target1);
        System.out.println("Array: " + Arrays.toString(nums1) + ", Target: " + target1);
        System.out.println("Indices: " + Arrays.toString(indices1));
        System.out.println("Values: " + nums1[indices1[0]] + " + " + nums1[indices1[1]] + " = " + target1);
        // Expected: [0, 1]

        System.out.println();

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] indices2 = twoSum(nums2, target2);
        System.out.println("Array: " + Arrays.toString(nums2) + ", Target: " + target2);
        System.out.println("Indices: " + Arrays.toString(indices2));
        System.out.println("Values: " + nums2[indices2[0]] + " + " + nums2[indices2[1]] + " = " + target2);
        // Expected: [1, 2]

        System.out.println();

        // Test Case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] indices3 = twoSum(nums3, target3);
        System.out.println("Array: " + Arrays.toString(nums3) + ", Target: " + target3);
        System.out.println("Indices: " + Arrays.toString(indices3));
        System.out.println("Values: " + nums3[indices3[0]] + " + " + nums3[indices3[1]] + " = " + target3);
        // Expected: [0, 1]

        System.out.println();

        // Test Case 4: No solution
        int[] nums4 = {1, 2, 3};
        int target4 = 10;
        int[] indices4 = twoSum(nums4, target4);
        System.out.println("Array: " + Arrays.toString(nums4) + ", Target: " + target4);
        System.out.println("Indices: " + Arrays.toString(indices4)); // Expected: [-1, -1]
    }
}
