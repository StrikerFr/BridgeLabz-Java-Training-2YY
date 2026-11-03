package String_01.Leetcode;

public class Leetcode_1528 {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }

    public static void main(String[] args) {
        Leetcode_1528 solution = new Leetcode_1528();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println("Restored string: " + solution.restoreString(s, indices));
    }
}
