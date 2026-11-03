package String_01.Leetcode;

public class Leetcode_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Leetcode_1662 solution = new Leetcode_1662();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println("Array strings are equal: " + solution.arrayStringsAreEqual(word1, word2));
    }
}
