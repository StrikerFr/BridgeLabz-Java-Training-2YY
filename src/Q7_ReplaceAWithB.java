import java.util.Scanner;

public class Q7_ReplaceAWithB {
    public static String replaceAWithB(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);

        if (firstChar == 'a') {
            return 'b' + replaceAWithB(remaining);
        } else {
            return firstChar + replaceAWithB(remaining);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Original string : " + input);
        System.out.println("After replacing : " + replaceAWithB(input));

        sc.close();
    }
}
