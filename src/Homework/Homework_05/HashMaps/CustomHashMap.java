package Homework.Homework_05.HashMaps;

import java.util.Objects;

/**
 * Problem 4 (Hash Maps): Implement a Custom Hash Map
 *
 * Description: Design and implement a basic hash map class with operations for
 * insertion, deletion, and retrieval using an array of linked lists to handle
 * collisions via separate chaining.
 *
 * Features:
 * - Generic key-value store <K, V>
 * - Separate chaining collision resolution
 * - Dynamic resizing / rehashing when load factor exceeds threshold (default 0.75)
 * - Operations: put, get, remove, containsKey, size, isEmpty, display
 */
public class CustomHashMap<K, V> {

    // Node representation for separate chaining
    public static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private Node<K, V>[] buckets;
    private int capacity;
    private int size;
    private final float loadFactor;

    @SuppressWarnings("unchecked")
    public CustomHashMap(int capacity, float loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.size = 0;
        this.buckets = new Node[capacity];
    }

    public CustomHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    // Hash function to map key to bucket index
    private int getBucketIndex(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode()) % capacity;
    }

    // Insert or update key-value pair
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> head = buckets[bucketIndex];

        // Check if key already exists, update value
        Node<K, V> curr = head;
        while (curr != null) {
            if (Objects.equals(curr.key, key)) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        // Insert new node at head of chain
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[bucketIndex] = newNode;
        size++;

        // Check load factor and rehash if necessary
        if ((float) size / capacity >= loadFactor) {
            rehash();
        }
    }

    // Retrieve value by key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> curr = buckets[bucketIndex];

        while (curr != null) {
            if (Objects.equals(curr.key, key)) {
                return curr.value;
            }
            curr = curr.next;
        }

        return null;
    }

    // Remove key-value pair and return removed value
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Node<K, V> curr = buckets[bucketIndex];
        Node<K, V> prev = null;

        while (curr != null) {
            if (Objects.equals(curr.key, key)) {
                if (prev == null) {
                    buckets[bucketIndex] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                size--;
                return curr.value;
            }
            prev = curr;
            curr = curr.next;
        }

        return null;
    }

    // Check if key exists
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Dynamic rehashing to double capacity and redistribute elements
    @SuppressWarnings("unchecked")
    private void rehash() {
        Node<K, V>[] oldBuckets = buckets;
        capacity *= 2;
        buckets = new Node[capacity];
        size = 0;

        for (Node<K, V> head : oldBuckets) {
            Node<K, V> curr = head;
            while (curr != null) {
                put(curr.key, curr.value);
                curr = curr.next;
            }
        }
    }

    // Display internal bucket distribution
    public void display() {
        System.out.println("CustomHashMap (Size=" + size + ", Capacity=" + capacity + "):");
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                System.out.print("  Bucket [" + i + "]: ");
                Node<K, V> curr = buckets[i];
                while (curr != null) {
                    System.out.print("{" + curr.key + " -> " + curr.value + "} -> ");
                    curr = curr.next;
                }
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 4: Implement a Custom Hash Map ===");

        CustomHashMap<String, Integer> map = new CustomHashMap<>(4, 0.75f);

        System.out.println("Inserting elements: Apple=100, Banana=40, Cherry=150, Date=80");
        map.put("Apple", 100);
        map.put("Banana", 40);
        map.put("Cherry", 150);
        map.put("Date", 80);

        map.display();

        System.out.println("\nRetrieval:");
        System.out.println("Value for Apple: " + map.get("Apple"));
        System.out.println("Value for Cherry: " + map.get("Cherry"));
        System.out.println("Contains Mango? " + map.containsKey("Mango"));

        System.out.println("\nUpdating Apple to 120:");
        map.put("Apple", 120);
        System.out.println("New Value for Apple: " + map.get("Apple"));

        System.out.println("\nRemoving Banana:");
        Integer removed = map.remove("Banana");
        System.out.println("Removed Value: " + removed);
        System.out.println("Contains Banana? " + map.containsKey("Banana"));

        System.out.println("\nAdding more items to test automatic rehashing:");
        map.put("Elderberry", 200);
        map.put("Fig", 90);
        map.put("Grape", 110);

        map.display();
    }
}
