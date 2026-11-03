package Homework.Homework_02.Arrays_Level_2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long temp = Math.abs(number);
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            long t = temp;
            while (t > 0) {
                count++;
                t /= 10;
            }
        }
        int[] digits = new int[count];
        long t = temp;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(t % 10);
            t /= 10;
        }
        int[] freq = new int[10];
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Frequency of " + i + ": " + freq[i]);
            }
        }
        sc.close();
    }
}

