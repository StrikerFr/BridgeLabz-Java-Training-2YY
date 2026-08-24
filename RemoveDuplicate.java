package Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        for (int i = 0; i < arr.length; i++) {

            if (i == 0 || arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
