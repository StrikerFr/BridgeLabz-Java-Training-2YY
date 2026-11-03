package String_01.Leetcode;

public class Leetcode_3110 {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return score;
    }

    public static void main(String[] args) {
        Leetcode_3110 solution = new Leetcode_3110();
        System.out.println("Score of string 'hello': " + solution.scoreOfString("hello"));
    }
}
