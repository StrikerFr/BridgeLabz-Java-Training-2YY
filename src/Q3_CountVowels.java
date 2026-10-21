import java.util.Scanner;

public class Q3_CountVowels {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int countVowels(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);

        if (isVowel(firstChar)) {
            return 1 + countVowels(remaining);
        } else {
            return countVowels(remaining);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Number of vowels = " + countVowels(input));

        sc.close();
    }
}
