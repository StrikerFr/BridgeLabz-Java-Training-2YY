package Questions;

public class GFG_maximumSumSubarray {
    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400};
        int k = 2;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}
