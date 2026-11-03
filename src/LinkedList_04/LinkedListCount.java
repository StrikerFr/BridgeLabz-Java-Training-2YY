package LinkedList_04;

public class LinkedListCount {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int count(Node head) {
        int c = 0;

        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println(count(head));

    }
}
