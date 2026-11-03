package Homework.Homework_02.Linear_and_Binary_Search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordFileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = sc.next();
        String targetWord = sc.next();
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}

