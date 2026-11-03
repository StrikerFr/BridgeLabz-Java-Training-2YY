package Questions;

import java.util.Scanner;

public class Leetcode_3065 {

    public int minOperations(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Leetcode_3065 obj = new Leetcode_3065();

        int result = obj.minOperations(nums, k);

        System.out.println("Answer: " + result);

        sc.close();
    }
}
