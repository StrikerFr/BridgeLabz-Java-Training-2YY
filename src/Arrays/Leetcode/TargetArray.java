package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < target.size(); i++) {
            ans[i] = target.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        TargetArray solution = new TargetArray();
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println("Target array: " + Arrays.toString(solution.createTargetArray(nums, index)));
    }
}
