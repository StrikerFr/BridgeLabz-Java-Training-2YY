import java.util.Scanner;

public class Q6_RemoveCharacter {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char target = sc.next().charAt(0);

        String result = removeChar(input, target);

        System.out.println("Original string : " + input);
        System.out.println("After removing '" + target + "' : " + result);

        sc.close();
    }
}
