package Homework.Homework_05.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class ZeroSumSubarrays {
    public static void findSubarrays(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                System.out.println("Subarray: [0, " + i + "]");
            }

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray: [" + (start + 1) + ", " + i + "]");
                }
            }

            if (!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        findSubarrays(arr);
    }
}
