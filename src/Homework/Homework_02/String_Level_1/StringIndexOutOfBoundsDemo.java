package Homework.Homework_02.String_Level_1;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        text.charAt(text.length() + 5);
    }

    public static void handleException(String text) {
        try {
            text.charAt(text.length() + 5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
        sc.close();
    }
}

