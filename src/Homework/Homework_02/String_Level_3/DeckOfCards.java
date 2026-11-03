package Homework.Homework_02.String_Level_3;

import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCard = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distributeDeck(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            return null;
        }
        String[][] distributed = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index];
                index++;
            }
        }
        return distributed;
    }

    public static void printCards(String[][] playerHand) {
        for (int i = 0; i < playerHand.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < playerHand[i].length; j++) {
                System.out.println("  " + playerHand[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cards = sc.nextInt();
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] distributed = distributeDeck(deck, players, cards);
        if (distributed != null) {
            printCards(distributed);
        } else {
            System.out.println("Cannot distribute required cards to players");
        }
        sc.close();
    }
}

