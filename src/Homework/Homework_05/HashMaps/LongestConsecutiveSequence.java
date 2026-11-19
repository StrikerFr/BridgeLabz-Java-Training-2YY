package Homework.Homework_05.HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem 3 (Hash Maps): Longest Consecutive Sequence
 *
 * Description: Given an unsorted array, find the length of the longest consecutive elements sequence.
 *
 * Approach:
 * - Insert all elements into a HashSet.
 * - Iterate over the elements. For each element x:
 *   - Check if (x - 1) is NOT in the set. If so, x is the start of a consecutive streak!
 *   - Count consecutive numbers (x + 1, x + 2, ...) while they exist in the set.
 *   - Update maximum length found.
 * - Each element is visited at most twice, resulting in O(N) linear time.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        for (int num : numSet) {
            // Check if 'num' is the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
    }

    // Helper: also returns the elements of the longest consecutive sequence
    public static List<Integer> getLongestConsecutiveList(int[] nums) {
        List<Integer> longestList = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return longestList;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int startOfLongest = 0;
        int maxLength = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                if (currentStreak > maxLength) {
                    maxLength = currentStreak;
                    startOfLongest = num;
                }
            }
        }

        for (int i = 0; i < maxLength; i++) {
            longestList.add(startOfLongest + i);
        }

        return longestList;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 3: Longest Consecutive Sequence ===");

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Input Array: " + Arrays.toString(nums1));
        System.out.println("Longest Consecutive Length: " + longestConsecutive(nums1));
        System.out.println("Sequence Elements: " + getLongestConsecutiveList(nums1));
        // Expected: 4 ([1, 2, 3, 4])

        System.out.println();
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Input Array: " + Arrays.toString(nums2));
        System.out.println("Longest Consecutive Length: " + longestConsecutive(nums2));
        System.out.println("Sequence Elements: " + getLongestConsecutiveList(nums2));
        // Expected: 9 ([0, 1, 2, 3, 4, 5, 6, 7, 8])

        System.out.println();
        int[] nums3 = {};
        System.out.println("Input Array: " + Arrays.toString(nums3));
        System.out.println("Longest Consecutive Length: " + longestConsecutive(nums3));
    }
}
