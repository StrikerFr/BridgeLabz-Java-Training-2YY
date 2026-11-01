import java.util.Scanner;

public class ShortestLongestWord {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {
        int len = getLength(text);
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        String[] words = new String[count];
        int idx = 0;
        StringBuilder cur = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                cur.append(text.charAt(i));
            } else if (cur.length() > 0) {
                words[idx] = cur.toString();
                idx++;
                cur = new StringBuilder();
            }
        }
        if (cur.length() > 0) {
            words[idx] = cur.toString();
        }
        return words;
    }

    public static int[] findShortestAndLongest(String[] words) {
        int shortestIdx = 0;
        int longestIdx = 0;
        for (int i = 1; i < words.length; i++) {
            if (getLength(words[i]) < getLength(words[shortestIdx])) {
                shortestIdx = i;
            }
            if (getLength(words[i]) > getLength(words[longestIdx])) {
                longestIdx = i;
            }
        }
        return new int[]{shortestIdx, longestIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        if (words.length == 0) {
            sc.close();
            return;
        }
        int[] indices = findShortestAndLongest(words);
        System.out.println("Shortest word: " + words[indices[0]]);
        System.out.println("Longest word: " + words[indices[1]]);
        sc.close();
    }
}
