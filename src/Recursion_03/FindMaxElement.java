package Recursion_03;

public class FindMaxElement {
    static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 45, 18};

        System.out.println(findMax(arr, arr.length));
    }
}
