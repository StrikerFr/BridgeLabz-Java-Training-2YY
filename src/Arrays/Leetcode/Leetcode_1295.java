package Arrays.Leetcode;

public class Leetcode_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;

            while (num > 0) {
                digits++;
                num /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Leetcode_1295 solution = new Leetcode_1295();
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("Numbers with even number of digits: " + solution.findNumbers(nums));
    }
}
