package Homework.Homework_02.String_Level_2;

import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) {
            return "rock";
        } else if (r == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "draw";
        }
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        }
        return "computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins = 0;
        int compWins = 0;
        int draws = 0;
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 1; i <= games; i++) {
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            if (winner.equals("user")) {
                userWins++;
            } else if (winner.equals("computer")) {
                compWins++;
            } else {
                draws++;
            }
            System.out.println(i + "\t" + user + "\t" + comp + "\t" + winner);
        }
        double userPct = ((double) userWins / games) * 100;
        double compPct = ((double) compWins / games) * 100;
        System.out.println("User Wins: " + userWins + " (" + userPct + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPct + "%)");
        System.out.println("Draws: " + draws);
        sc.close();
    }
}

