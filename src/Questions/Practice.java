package Questions;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(4, "Orange");

        System.out.println(map.get(1));
        System.out.println(map.get(3));
    }
}
