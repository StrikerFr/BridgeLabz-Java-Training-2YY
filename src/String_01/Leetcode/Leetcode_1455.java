package String_01.Leetcode;

public class Leetcode_1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Leetcode_1455 solution = new Leetcode_1455();
        System.out.println("Prefix word index: " + solution.isPrefixOfWord("i love eating burger", "burg"));
    }
}
