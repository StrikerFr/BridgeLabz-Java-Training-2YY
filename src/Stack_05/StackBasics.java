package Stack_05;

import java.util.Stack;

public class StackBasics {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);

        System.out.println("peek: " + s.peek());
        System.out.println("pop: " + s.pop());
        System.out.println("after Pop: " + s);
        System.out.println("is Empty: " + s.isEmpty());
    }
}
