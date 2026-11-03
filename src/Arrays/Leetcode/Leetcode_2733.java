package Arrays.Leetcode;

public class Leetcode_2733 {
    public int findNonMinOrMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        for (int num : nums) {
            if (num != min && num != max) return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        Leetcode_2733 solution = new Leetcode_2733();
        int[] nums = {3, 2, 1, 4};
        System.out.println("Neither min nor max: " + solution.findNonMinOrMax(nums));
    }
}
