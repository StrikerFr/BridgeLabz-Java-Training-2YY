package Questions;

import java.util.Scanner;

class Leetcode_2176 {

    public int Leetcode_2176(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k =sc.nextInt();

        Leetcode_2176 obj = new Leetcode_2176();

        int result = obj.Leetcode_2176(nums, k);

        System.out.println("Answer: " + result);

        sc.close();
    }
}