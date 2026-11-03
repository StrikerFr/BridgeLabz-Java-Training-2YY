package Homework.Homework_02.String_Level_1;

import java.util.Scanner;

public class ToLowerCaseDemo {
    public static String toLowerCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            } else {
                sb.append(ch);
            }
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
        String custom = toLowerCase(text);
        String builtIn = text.toLowerCase();
        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Equal: " + compareStrings(custom, builtIn));
        sc.close();
    }
}

