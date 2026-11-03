package Recursion_03;

import java.util.Scanner;

public class Power {
    static long power(int p, int q) {

        if (q == 0) {
            return 1;
        }
        return p * power(p, q - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power(p, q));
        sc.close();
    }
}
