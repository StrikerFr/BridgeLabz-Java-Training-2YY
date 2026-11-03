package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_2595 {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int index = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                if (index % 2 == 0)
                    even++;
                else
                    odd++;
            }

            n = n / 2;
            index++;
        }

        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        Leetcode_2595 solution = new Leetcode_2595();
        System.out.println("Even and odd bits for 50: " + Arrays.toString(solution.evenOddBit(50)));
    }
}
