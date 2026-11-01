import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesStringBuilder {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeDuplicates(s));
        sc.close();
    }
}
