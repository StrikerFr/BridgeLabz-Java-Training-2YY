package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_2094 {
    public int[] findEvenNumbers(int[] digits) {
        boolean[] used = new boolean[1000];

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i == j || j == k || i == k) continue;
                    if (digits[i] == 0) continue;
                    if (digits[k] % 2 != 0) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    used[num] = true;
                }
            }
        }

        int count = 0;
        for (int i = 100; i <= 999; i++) {
            if (used[i]) count++;
        }

        int[] ans = new int[count];
        int index = 0;
        for (int i = 100; i <= 999; i++) {
            if (used[i]) {
                ans[index++] = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Leetcode_2094 solution = new Leetcode_2094();
        int[] digits = {2, 1, 3, 0};
        System.out.println("3-digit even numbers: " + Arrays.toString(solution.findEvenNumbers(digits)));
    }
}
