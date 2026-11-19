package Homework.Homework_05.HashMaps;

public class CustomHashMap {
    static class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets;
    private int capacity;
    private int size;

    public CustomHashMap() {
        this.capacity = 10;
        this.buckets = new Node[capacity];
        this.size = 0;
    }

    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(String key, int value) {
        int index = getBucketIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    public int get(String key) {
        int index = getBucketIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return -1;
    }

    public void remove(String key) {
        int index = getBucketIndex(key);
        Node head = buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public boolean containsKey(String key) {
        return get(key) != -1;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put("apple", 100);
        map.put("banana", 50);
        map.put("cherry", 200);

        System.out.println("apple: " + map.get("apple"));
        System.out.println("banana: " + map.get("banana"));
        System.out.println("contains cherry: " + map.containsKey("cherry"));

        map.remove("banana");
        System.out.println("after remove banana: " + map.get("banana"));
    }
}
