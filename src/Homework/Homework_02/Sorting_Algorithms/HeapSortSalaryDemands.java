package Homework.Homework_02.Sorting_Algorithms;

import java.util.Scanner;

public class HeapSortSalaryDemands {
    public static void heapify(double[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            double swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(double[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] salaries = new double[n];
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextDouble();
        }
        heapSort(salaries);
        for (int i = 0; i < salaries.length; i++) {
            System.out.print(salaries[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

