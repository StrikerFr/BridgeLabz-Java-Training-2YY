package Homework.Homework_03.Recursion_and_Backtracking;

import java.util.Scanner;

public class SubsetSum {
    public static boolean hasSubsetSum(int[] arr, int n, int target) {
        if (target == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (arr[n - 1] > target) {
            return hasSubsetSum(arr, n - 1, target);
        }
        return hasSubsetSum(arr, n - 1, target) || hasSubsetSum(arr, n - 1, target - arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(hasSubsetSum(arr, n, target));
        sc.close();
    }
}

