package Homework.Homework_02.Linear_and_Binary_Search;

import java.util.Scanner;

public class SearchWordLinearSearch {
    public static String searchSentence(String[] sentences, String word) {
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                return sentences[i];
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] sentences = new String[n];
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }
        String word = sc.nextLine();
        System.out.println(searchSentence(sentences, word));
        sc.close();
    }
}

