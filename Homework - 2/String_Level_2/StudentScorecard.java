import java.util.Scanner;

public class StudentScorecard {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90);
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double pct = avg;
            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = pct;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double pct = stats[i][2];
            if (pct >= 80) {
                grades[i] = "A";
            } else if (pct >= 70) {
                grades[i] = "B";
            } else if (pct >= 60) {
                grades[i] = "C";
            } else if (pct >= 50) {
                grades[i] = "D";
            } else if (pct >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%\t\t" + grades[i]);
        }
        sc.close();
    }
}
