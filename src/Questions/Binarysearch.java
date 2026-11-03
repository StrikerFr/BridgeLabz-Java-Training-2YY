package Questions;

public class Binarysearch {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println("Target found at index: " + mid);
                break;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left > right) {
            System.out.println("Target not found");
        }
    }
}
