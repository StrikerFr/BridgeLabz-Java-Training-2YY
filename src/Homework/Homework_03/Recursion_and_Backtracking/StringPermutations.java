package Homework.Homework_03.Recursion_and_Backtracking;

import java.util.Scanner;

public class StringPermutations {
    public static void permute(char[] chars, int left, int right) {
        if (left == right) {
            System.out.println(new String(chars));
            return;
        }
        for (int i = left; i <= right; i++) {
            char temp = chars[left];
            chars[left] = chars[i];
            chars[i] = temp;

            permute(chars, left + 1, right);

            temp = chars[left];
            chars[left] = chars[i];
            chars[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permute(s.toCharArray(), 0, s.length() - 1);
        sc.close();
    }
}

