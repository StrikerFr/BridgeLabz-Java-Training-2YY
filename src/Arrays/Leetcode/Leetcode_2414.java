package Arrays.Leetcode;

public class Leetcode_2414 {
    public int longestContinuousSubstring(String s) {
        int count = 1;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) + 1) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        Leetcode_2414 solution = new Leetcode_2414();
        System.out.println("Longest continuous substring length: " + solution.longestContinuousSubstring("abacaba"));
    }
}
