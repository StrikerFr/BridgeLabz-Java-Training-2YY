package Homework.Homework_02.String_Level_2;

import java.util.Scanner;

public class StringLength {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Custom length: " + getLength(text));
        System.out.println("Built-in length: " + text.length());
        sc.close();
    }
}

