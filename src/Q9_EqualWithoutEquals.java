import java.util.Scanner;

public class Q9_EqualWithoutEquals {
    public static boolean isEqual(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }

        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        if (s1.charAt(0) != s2.charAt(0)) {
            return false;
        }

        return isEqual(s1.substring(1), s2.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string  : ");
        String first = sc.nextLine();

        System.out.print("Enter second string : ");
        String second = sc.nextLine();

        if (isEqual(first, second)) {
            System.out.println("Both strings are EQUAL.");
        } else {
            System.out.println("Both strings are NOT equal.");
        }

        sc.close();
    }
}
