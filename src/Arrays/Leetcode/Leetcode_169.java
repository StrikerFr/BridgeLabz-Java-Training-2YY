package Arrays.Leetcode;

public class Leetcode_169 {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int n : nums) {
            if (count == 0) candidate = n;
            count += (n == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        Leetcode_169 solution = new Leetcode_169();
        int[] nums = {3, 2, 3};
        System.out.println("Majority element: " + solution.majorityElement(nums));
    }
}
