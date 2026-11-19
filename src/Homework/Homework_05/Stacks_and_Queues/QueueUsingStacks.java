package Homework.Homework_05.Stacks_and_Queues;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Problem 1: Implement a Queue Using Stacks
 *
 * Description: Design a queue using two stacks such that enqueue and dequeue
 * operations are performed efficiently.
 *
 * Approach:
 * - Use 'inStack' for enqueue operations.
 * - Use 'outStack' for dequeue and peek operations.
 * - Transfer elements from inStack to outStack only when outStack is empty (amortized O(1)).
 */
public class QueueUsingStacks {

    private final Stack<Integer> inStack;
    private final Stack<Integer> outStack;

    public QueueUsingStacks() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Enqueue an element to the rear of the queue - O(1)
    public void enqueue(int x) {
        inStack.push(x);
    }

    // Helper: transfer elements from inStack to outStack if outStack is empty
    private void transferIfEmpty() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    // Dequeue an element from the front of the queue - Amortized O(1)
    public int dequeue() {
        transferIfEmpty();
        if (outStack.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return outStack.pop();
    }

    // Get the front element without removing it - Amortized O(1)
    public int peek() {
        transferIfEmpty();
        if (outStack.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return outStack.peek();
    }

    // Check if the queue is empty - O(1)
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Get the number of elements in the queue - O(1)
    public int size() {
        return inStack.size() + outStack.size();
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 1: Queue Using Two Stacks ===");

        QueueUsingStacks q = new QueueUsingStacks();

        System.out.println("Enqueuing: 10, 20, 30");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Current Front (peek): " + q.peek()); // 10
        System.out.println("Queue size: " + q.size()); // 3

        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Dequeued: " + q.dequeue()); // 20

        System.out.println("Enqueuing: 40, 50");
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Current Front (peek): " + q.peek()); // 30
        System.out.println("Dequeued: " + q.dequeue()); // 30
        System.out.println("Dequeued: " + q.dequeue()); // 40
        System.out.println("Dequeued: " + q.dequeue()); // 50

        System.out.println("Is queue empty? " + q.isEmpty()); // true
    }
}
