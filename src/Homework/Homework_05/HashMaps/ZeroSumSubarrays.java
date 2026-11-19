package Homework.Homework_05.HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem 1 (Hash Maps): Find All Subarrays with Zero Sum
 *
 * Description: Given an array, find all subarrays whose elements sum up to zero.
 *
 * Approach:
 * - Maintain a prefix sum while iterating through the array.
 * - Use a HashMap that maps a prefix sum to a list of indices where that sum occurred.
 * - Initialize the map with sum 0 at index -1 to detect subarrays starting from index 0.
 * - Whenever a prefix sum repeats at index i, every previous occurrence index prev
 *   defines a subarray (prev + 1 to i) that sums to zero.
 *
 * Time Complexity: O(N + total subarrays found)
 * Space Complexity: O(N)
 */
public class ZeroSumSubarrays {

    public static class SubarrayRange {
        public int start;
        public int end;

        public SubarrayRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start + "..." + end + "]";
        }
    }

    public static List<SubarrayRange> findZeroSumSubarrays(int[] arr) {
        List<SubarrayRange> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        // Map: prefixSum -> list of indices where this sum occurred
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Base case: prefix sum 0 occurs at index -1
        List<Integer> initialList = new ArrayList<>();
        initialList.add(-1);
        map.put(0, initialList);

        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {
                List<Integer> prevIndices = map.get(prefixSum);
                for (int prev : prevIndices) {
                    result.add(new SubarrayRange(prev + 1, i));
                }
            } else {
                map.put(prefixSum, new ArrayList<>());
            }

            map.get(prefixSum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 1: Find All Subarrays with Zero Sum ===");

        int[] arr1 = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println("Input Array: " + Arrays.toString(arr1));
        List<SubarrayRange> subarrays1 = findZeroSumSubarrays(arr1);
        System.out.println("Zero-sum Subarrays (indices): " + subarrays1);
        for (SubarrayRange range : subarrays1) {
            int[] sub = Arrays.copyOfRange(arr1, range.start, range.end + 1);
            System.out.println("  Subarray from index " + range.start + " to " + range.end + ": " + Arrays.toString(sub));
        }

        System.out.println();
        int[] arr2 = {1, 2, -3, 3, -1, -2};
        System.out.println("Input Array: " + Arrays.toString(arr2));
        List<SubarrayRange> subarrays2 = findZeroSumSubarrays(arr2);
        System.out.println("Zero-sum Subarrays (indices): " + subarrays2);
        for (SubarrayRange range : subarrays2) {
            int[] sub = Arrays.copyOfRange(arr2, range.start, range.end + 1);
            System.out.println("  Subarray from index " + range.start + " to " + range.end + ": " + Arrays.toString(sub));
        }
    }
}
