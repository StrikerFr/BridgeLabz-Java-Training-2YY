package Homework.Homework_05.Stacks_and_Queues;

import java.util.Arrays;
import java.util.Stack;

/**
 * Problem 3: Stock Span Problem
 *
 * Description: For each day in a stock price array, calculate the span
 * (number of consecutive days the price was less than or equal to the current day's price).
 *
 * Approach:
 * - Use a monotonic stack of indices in descending order of prices.
 * - For day i, pop all indices whose price is <= prices[i].
 * - If stack is empty, all previous days had price <= prices[i], so span = i + 1.
 * - Else, span = i - stack.peek().
 * - Push current index i onto stack.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        if (prices == null || prices.length == 0) {
            return new int[0];
        }

        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stack stores indices

        for (int i = 0; i < n; i++) {
            // Pop elements while stack is not empty and price on stack day <= current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack becomes empty, current price is greater than all previous elements
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current day index onto stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 3: Stock Span Problem ===");

        int[] prices1 = {100, 80, 60, 70, 60, 75, 85};
        int[] span1 = calculateSpan(prices1);
        System.out.println("Stock Prices: " + Arrays.toString(prices1));
        System.out.println("Stock Spans:  " + Arrays.toString(span1));
        // Expected: [1, 1, 1, 2, 1, 4, 6]

        System.out.println();
        int[] prices2 = {10, 4, 5, 90, 120, 80};
        int[] span2 = calculateSpan(prices2);
        System.out.println("Stock Prices: " + Arrays.toString(prices2));
        System.out.println("Stock Spans:  " + Arrays.toString(span2));
        // Expected: [1, 1, 2, 4, 5, 1]
    }
}
