package Homework.Homework_05.Stacks_and_Queues;

import java.util.Stack;

/**
 * Problem 2: Sort a Stack Using Recursion
 *
 * Description: Given a stack, sort its elements in ascending order using recursion
 * (without using any external loops or helper data structures).
 *
 * Approach:
 * 1. Base case: If stack is empty, return.
 * 2. Pop top element, recursively sort the remaining stack.
 * 3. Insert the popped element back into the sorted stack at its correct position.
 */
public class SortStackRecursion {

    // Recursively sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursively sort remaining stack
        sortStack(stack);

        // Insert popped element back into sorted stack
        sortedInsert(stack, top);
    }

    // Helper: Insert an element in a sorted stack such that order is maintained
    public static void sortedInsert(Stack<Integer> stack, int element) {
        // If stack is empty or element is greater than top, push it
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        // Otherwise, pop top and recurse
        int top = stack.pop();
        sortedInsert(stack, element);

        // Put the stored top back
        stack.push(top);
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 2: Sort Stack Using Recursion ===");

        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Original Stack (bottom to top): " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack (ascending: bottom to top): " + stack);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(5);
        stack2.push(1);
        stack2.push(4);
        stack2.push(2);
        stack2.push(3);

        System.out.println("\nOriginal Stack 2: " + stack2);
        sortStack(stack2);
        System.out.println("Sorted Stack 2: " + stack2);
    }
}
