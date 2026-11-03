package Homework.Homework_02.Linear_and_Binary_Search;

import java.util.Scanner;

public class ReverseStringBuilder {
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
        sc.close();
    }
}

