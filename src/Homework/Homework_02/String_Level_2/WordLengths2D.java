package Homework.Homework_02.String_Level_2;

import java.util.Scanner;

public class WordLengths2D {
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
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        String[] words = new String[count];
        int idx = 0;
        StringBuilder cur = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                cur.append(text.charAt(i));
            } else if (cur.length() > 0) {
                words[idx] = cur.toString();
                idx++;
                cur = new StringBuilder();
            }
        }
        if (cur.length() > 0) {
            words[idx] = cur.toString();
        }
        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] wordData = getWordLengths(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            System.out.println(wordData[i][0] + "\t" + len);
        }
        sc.close();
    }
}

