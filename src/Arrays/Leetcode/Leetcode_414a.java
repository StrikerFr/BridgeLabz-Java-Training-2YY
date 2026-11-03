package Arrays.Leetcode;

public class Leetcode_414a {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == second || num == third) continue;

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        if (third == Long.MIN_VALUE) {
            return (int) first;
        }

        return (int) third;
    }

    public static void main(String[] args) {
        Leetcode_414a solution = new Leetcode_414a();
        int[] nums = {3, 2, 1};
        System.out.println("Third maximum number: " + solution.thirdMax(nums));
    }
}
