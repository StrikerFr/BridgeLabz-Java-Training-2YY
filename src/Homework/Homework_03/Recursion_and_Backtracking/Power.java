package Homework.Homework_03.Recursion_and_Backtracking;

import java.util.Scanner;

public class Power {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / power(x, -n);
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(power(x, n));
        sc.close();
    }
}

