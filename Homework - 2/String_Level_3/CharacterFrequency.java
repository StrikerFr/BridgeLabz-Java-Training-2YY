import java.util.Scanner;

public class CharacterFrequency {
    public static String[][] getFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] < 0) {
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }
        String[][] result = new String[uniqueCount][2];
        boolean[] seen = new boolean[256];
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result[idx][0] = String.valueOf(ch);
                result[idx][1] = String.valueOf(freq[ch]);
                idx++;
            }
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
