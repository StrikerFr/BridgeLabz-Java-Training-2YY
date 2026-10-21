import java.util.Scanner;

public class Q10_RemoveDuplicates {
    public static String removeChar(String str, char target) {
        if (str.isEmpty()) {
            return "";
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);

        if (firstChar == target) {
            return removeChar(remaining, target);
        } else {
            return firstChar + removeChar(remaining, target);
        }
    }

    public static String removeDuplicates(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char firstChar = str.charAt(0);

        String remaining = removeChar(str.substring(1), firstChar);

        return firstChar + removeDuplicates(remaining);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Original string          : " + input);
        System.out.println("After removing duplicates: " + removeDuplicates(input));

        sc.close();
    }
}
