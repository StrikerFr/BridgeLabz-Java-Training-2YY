package String_01.Leetcode;

class Leetcode_1512 {
    public int Leetcode_1512(int[] nums) {
        int[] count = new int[101];
        int ans = 0;
        for (int num : nums) {
            ans += count[num];
            count[num]++;
        }
        return ans;
    }
}
