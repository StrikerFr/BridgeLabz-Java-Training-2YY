package Homework.Homework_02.String_Level_1;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
        sc.close();
    }
}

