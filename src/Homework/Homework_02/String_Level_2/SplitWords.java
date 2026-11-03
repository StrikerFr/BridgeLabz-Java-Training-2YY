package Homework.Homework_02.String_Level_2;

import java.util.Scanner;

public class SplitWords {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int len = getLength(text);
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        String[] words = new String[wordCount];
        int idx = 0;
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                current.append(text.charAt(i));
            } else if (current.length() > 0) {
                words[idx] = current.toString();
                idx++;
                current = new StringBuilder();
            }
        }
        if (current.length() > 0) {
            words[idx] = current.toString();
        }
        return words;
    }

    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] customWords = splitWords(text);
        String[] builtInWords = text.trim().split("\\s+");
        for (int i = 0; i < customWords.length; i++) {
            System.out.println(customWords[i]);
        }
        System.out.println("Equal: " + compareArrays(customWords, builtInWords));
        sc.close();
    }
}

