package String_01.Leetcode;

public class Leetcode_2109 {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder ans = new StringBuilder();

        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            if (j < spaces.length && i == spaces[j]) {
                ans.append(" ");
                j++;
            }

            ans.append(s.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Leetcode_2109 solution = new Leetcode_2109();
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        System.out.println("With spaces: " + solution.addSpaces(s, spaces));
    }
}
