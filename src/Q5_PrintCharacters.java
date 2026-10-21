import java.util.Scanner;

public class Q5_PrintCharacters {
    public static void printChars(String str) {
        if (str.isEmpty()) {
            return;
        }

        System.out.println(str.charAt(0));

        printChars(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Characters of the string:");
        printChars(input);

        sc.close();
    }
}
