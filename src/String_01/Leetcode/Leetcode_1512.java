package String_01.Leetcode;

public class Leetcode_1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int ans = 0;
        for (int num : nums) {
            ans += count[num];
            count[num]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Leetcode_1512 solution = new Leetcode_1512();
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println("Identical pairs: " + solution.numIdenticalPairs(nums));
    }
}
