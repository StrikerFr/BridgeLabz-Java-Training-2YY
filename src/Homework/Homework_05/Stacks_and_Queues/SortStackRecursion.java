package Homework.Homework_05.Stacks_and_Queues;

import java.util.Stack;

public class SortStackRecursion {
    public static void sortStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int temp = s.pop();
        sortStack(s);
        insertSorted(s, temp);
    }

    public static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || s.peek() <= x) {
            s.push(x);
            return;
        }

        int temp = s.pop();
        insertSorted(s, x);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);

        System.out.println("Original: " + s);
        sortStack(s);
        System.out.println("Sorted: " + s);
    }
}
