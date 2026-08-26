class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        for (int num : nums) {
            if (num != min && num != max)
                return num;
        }

        return -1;
    }
}