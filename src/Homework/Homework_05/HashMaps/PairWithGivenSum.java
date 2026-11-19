package Homework.Homework_05.HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem 2 (Hash Maps): Check for a Pair with Given Sum in an Array
 *
 * Description: Given an array and a target sum, find if there exists a pair of elements
 * whose sum is equal to the target.
 *
 * Approach:
 * - Use a HashSet to store visited numbers.
 * - For each element x in the array, check if (target - x) is in the set.
 * - If found, the pair is (target - x, x).
 * - Otherwise, add x to the set and continue.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class PairWithGivenSum {

    // Check if any pair sums to target
    public static boolean hasPairWithSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        Set<Integer> visited = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (visited.contains(complement)) {
                return true;
            }
            visited.add(num);
        }

        return false;
    }

    // Find the first pair that sums to target, or null if none
    public static int[] findPair(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        Set<Integer> visited = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (visited.contains(complement)) {
                return new int[]{complement, num};
            }
            visited.add(num);
        }

        return null;
    }

    // Find all unique pairs that sum to target
    public static List<int[]> findAllPairs(int[] arr, int target) {
        List<int[]> pairs = new ArrayList<>();
        if (arr == null || arr.length < 2) {
            return pairs;
        }

        Set<Integer> visited = new HashSet<>();
        Set<Integer> recorded = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (visited.contains(complement) && !recorded.contains(num) && !recorded.contains(complement)) {
                pairs.add(new int[]{complement, num});
                recorded.add(num);
                recorded.add(complement);
            }
            visited.add(num);
        }

        return pairs;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 2: Check for a Pair with Given Sum ===");

        int[] arr1 = {8, 7, 2, 5, 3, 1};
        int target1 = 10;
        System.out.println("Array: " + Arrays.toString(arr1) + ", Target: " + target1);
        System.out.println("Pair exists? " + hasPairWithSum(arr1, target1));
        int[] firstPair = findPair(arr1, target1);
        System.out.println("First Pair: " + Arrays.toString(firstPair));

        List<int[]> allPairs = findAllPairs(arr1, target1);
        System.out.print("All Unique Pairs: ");
        for (int[] p : allPairs) {
            System.out.print(Arrays.toString(p) + " ");
        }
        System.out.println();

        System.out.println();
        int[] arr2 = {5, 2, 6, 8, 1, 9};
        int target2 = 25;
        System.out.println("Array: " + Arrays.toString(arr2) + ", Target: " + target2);
        System.out.println("Pair exists? " + hasPairWithSum(arr2, target2));
        System.out.println("First Pair: " + Arrays.toString(findPair(arr2, target2)));
    }
}
