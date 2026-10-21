import java.util.Scanner;

public class Q8_LengthWithoutLength {
    public static int findLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Length of the string = " + findLength(input));

        sc.close();
    }
}
