package Arrays;

public class PairTripletCount {

    public static int pairCount(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int tripletCount(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 9;

        System.out.println("Pair Count = " + pairCount(arr, target));
        System.out.println("Triplet Count = " + tripletCount(arr, target));
    }
}
