package Arrays;

public class MaxSecondMax {

    public static int maxElement(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int secondMaxElement(int[] arr) {

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 34, 67};

        System.out.println("Maximum Element = " + maxElement(arr));
        System.out.println("Second Maximum Element = " + secondMaxElement(arr));
    }
}
