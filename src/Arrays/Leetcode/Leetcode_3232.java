package Arrays.Leetcode;

public class Leetcode_3232 {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int doubleDigit = 0;

        for (int num : nums) {
            if (num < 10)
                single += num;
            else
                doubleDigit += num;
        }

        return single != doubleDigit;
    }

    public static void main(String[] args) {
        Leetcode_3232 solution = new Leetcode_3232();
        int[] nums = {1, 2, 3, 4, 10};
        System.out.println("Can Alice win: " + solution.canAliceWin(nums));
    }
}
