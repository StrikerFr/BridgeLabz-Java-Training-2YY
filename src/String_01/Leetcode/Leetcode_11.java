package String_01.Leetcode;

public class Leetcode_11 {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {

            int width = right - left;
            int h = Math.min(height[left], height[right]);

            int area = width * h;

            max = Math.max(max, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Leetcode_11 obj = new Leetcode_11();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = obj.maxArea(height);

        System.out.println("Max area: " + result);
    }
}
