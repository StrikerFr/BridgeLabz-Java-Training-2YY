package Homework.Homework_02.Linear_and_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositiveAndBinarySearch {
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 2];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int missing = findFirstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);
        Arrays.sort(arr);
        int targetIndex = binarySearch(arr, target);
        System.out.println("Target Index in Sorted Array: " + targetIndex);
        sc.close();
    }
}

