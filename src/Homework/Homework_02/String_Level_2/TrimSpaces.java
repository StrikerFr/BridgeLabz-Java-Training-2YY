package Homework.Homework_02.String_Level_2;

import java.util.Scanner;

public class TrimSpaces {
    public static int[] getTrimBounds(String text) {
        int start = 0;
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        int end = text.length() - 1;
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }

    public static String substringCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] bounds = getTrimBounds(text);
        String customTrim = substringCharAt(text, bounds[0], bounds[1]);
        String builtInTrim = text.trim();
        System.out.println("Custom trim: \"" + customTrim + "\"");
        System.out.println("Built-in trim: \"" + builtInTrim + "\"");
        System.out.println("Equal: " + compareStrings(customTrim, builtInTrim));
        sc.close();
    }
}

