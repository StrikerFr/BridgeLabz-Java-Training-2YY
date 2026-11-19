package Homework.Homework_05.Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Problem 4: Sliding Window Maximum
 *
 * Description: Given an array and a window size k, find the maximum element in
 * each sliding window of size k.
 *
 * Approach:
 * - Use a double-ended queue (Deque) to store indices of array elements.
 * - Maintain elements in monotonically decreasing order of their values.
 * - Remove elements outside the current window from the front.
 * - Remove elements smaller than current element from the back.
 * - Front of deque always holds the index of the maximum element in the current window.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(k)
 */
public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        if (k > n) {
            k = n;
        }

        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // 1. Remove indices outside the current window [i - k + 1, i]
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // 2. Remove indices whose corresponding values are <= nums[i]
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // 3. Add current element's index
            deque.offerLast(i);

            // 4. Once we have reached at least k elements, record maximum (front of deque)
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 4: Sliding Window Maximum ===");

        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        int[] res1 = maxSlidingWindow(nums1, k1);
        System.out.println("Array: " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Sliding Window Maximums: " + Arrays.toString(res1));
        // Expected: [3, 3, 5, 5, 6, 7]

        System.out.println();
        int[] nums2 = {9, 11};
        int k2 = 2;
        int[] res2 = maxSlidingWindow(nums2, k2);
        System.out.println("Array: " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Sliding Window Maximums: " + Arrays.toString(res2));
        // Expected: [11]

        System.out.println();
        int[] nums3 = {1, -1};
        int k3 = 1;
        int[] res3 = maxSlidingWindow(nums3, k3);
        System.out.println("Array: " + Arrays.toString(nums3) + ", k = " + k3);
        System.out.println("Sliding Window Maximums: " + Arrays.toString(res3));
        // Expected: [1, -1]
    }
}
