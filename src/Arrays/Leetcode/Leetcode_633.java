package Arrays.Leetcode;

public class Leetcode_633 {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);

        while (a <= b) {
            int sum = a * a + b * b;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                a++;
            } else {
                b--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Leetcode_633 solution = new Leetcode_633();
        System.out.println("Judge square sum for 5: " + solution.judgeSquareSum(5));
    }
}
