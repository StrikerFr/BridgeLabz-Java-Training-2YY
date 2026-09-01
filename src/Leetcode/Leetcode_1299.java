package Questions;

import java.util.Scanner;

class Leetcode_1299 {

    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int max = arr[i + 1];

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            arr[i] = max;
        }

        arr[arr.length - 1] = -1;

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Leetcode_1299 obj = new Leetcode_1299();
        int[] result = obj.replaceElements(arr);
        System.out.println("Answer:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}