package Recursion_03;

public class RemoveChar {
    static String removeChar(String str, char ch, int i) {
        if (i == str.length()) {
            return "";
        }

        if (str.charAt(i) == ch) {
            return removeChar(str, ch, i + 1);
        }

        return str.charAt(i) + removeChar(str, ch, i + 1);
    }

    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';

        System.out.println(removeChar(str, ch, 0));
    }
}
