import java.util.Scanner;

public class SubstringDemo {
    public static String substringCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String sub1 = substringCharAt(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("Custom substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Equal: " + compareStrings(sub1, sub2));
        sc.close();
    }
}
