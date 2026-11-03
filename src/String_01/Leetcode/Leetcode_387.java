package String_01.Leetcode;

public class Leetcode_387 {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Leetcode_387 solution = new Leetcode_387();
        System.out.println("First unique character index in 'leetcode': " + solution.firstUniqChar("leetcode"));
    }
}
