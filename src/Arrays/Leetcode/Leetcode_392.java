package Arrays.Leetcode;

public class Leetcode_392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;

        for (int j = 0; j < t.length(); j++) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        Leetcode_392 solution = new Leetcode_392();
        System.out.println("Is 'abc' subsequence of 'ahbgdc': " + solution.isSubsequence("abc", "ahbgdc"));
    }
}
