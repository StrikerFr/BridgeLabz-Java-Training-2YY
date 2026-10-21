import java.util.Scanner;

public class Q4_CountCharacter {
    public static int countChar(String str, char target) {
        if (str.isEmpty()) {
            return 0;
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);

        if (firstChar == target) {
            return 1 + countChar(remaining, target);
        } else {
            return countChar(remaining, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to count: ");
        char target = sc.next().charAt(0);

        int count = countChar(input, target);
        System.out.println("The character '" + target + "' occurs " + count + " time(s).");

        sc.close();
    }
}
