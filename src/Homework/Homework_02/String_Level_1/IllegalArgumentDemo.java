package Homework.Homework_02.String_Level_1;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
        sc.close();
    }
}

