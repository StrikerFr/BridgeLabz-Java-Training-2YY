import java.util.Scanner;

public class CharacterFrequencyUnique {
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < count; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static String[][] getFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] uniques = uniqueCharacters(text);
        String[][] result = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(freq[uniques[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String[][] frequencies = getFrequencies(text);
        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + "\t" + frequencies[i][1]);
        }
        sc.close();
    }
}
