package String_01.Leetcode;

public class Leetcode_171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode_171 solution = new Leetcode_171();
        System.out.println("Column number for 'ZY': " + solution.titleToNumber("ZY"));
    }
}
