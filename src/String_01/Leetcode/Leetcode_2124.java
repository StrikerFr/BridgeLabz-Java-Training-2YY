package String_01.Leetcode;

public class Leetcode_2124 {
    public boolean checkString(String s) {
        boolean seenB = false;

        for (char c : s.toCharArray()) {

            if (c == 'b') {
                seenB = true;
            }

            if (c == 'a' && seenB) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Leetcode_2124 solution = new Leetcode_2124();
        System.out.println("Check string 'aaabbb': " + solution.checkString("aaabbb"));
    }
}
