package Arrays.Sliding_Window;

public class Leetcode_1343 {

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;

        int sum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= k * threshold) {
            count++;
        }

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            if (sum >= k * threshold) {
                count++;
            }
        }

        System.out.println("Answer = " + count);
    }
}
