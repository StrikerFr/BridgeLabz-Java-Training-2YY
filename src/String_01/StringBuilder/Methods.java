package String_01.StringBuilder;

public class Methods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.delete(5, 10);
        sb.deleteCharAt(5);
        char ch = sb.charAt(0);
        sb.setCharAt(0, 'h');
        int len = sb.length();
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);
    }
}

