import java.util.Scanner;

public class Q1_ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        return reverse(remaining) + firstChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverse(input);

        System.out.println("Original string : " + input);
        System.out.println("Reversed string : " + result);

        sc.close();
    }
}
