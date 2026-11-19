package Stack_05;

import java.util.Stack;

public class StackOps {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);

        int n = 5;
        int count = 0;

        for (int i : s) {
            System.out.println(i);
            count++;
        }

        for (int i = count; i < n; i++) {
            System.out.println(0);
        }
    }
}
