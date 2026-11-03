package Homework.Homework_02.String_Level_3;

import java.util.Scanner;

public class CharacterFrequencyNested {
    public static String[] getFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int validCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                validCount++;
            }
        }
        String[] result = new String[validCount];
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[idx] = chars[i] + ": " + freq[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String[] result = getFrequencies(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}

