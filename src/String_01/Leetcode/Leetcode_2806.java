package String_01.Leetcode;

public class Leetcode_2806 {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = ((purchaseAmount + 5) / 10) * 10;
        return 100 - rounded;
    }

    public static void main(String[] args) {
        Leetcode_2806 solution = new Leetcode_2806();
        System.out.println("Balance after purchase of 15: " + solution.accountBalanceAfterPurchase(15));
    }
}
