import java.util.Scanner;

public class RatInAMaze {
    public static boolean isSafe(int[][] maze, int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1;
    }

    public static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol, int n) {
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y, n)) {
            if (sol[x][y] == 1) {
                return false;
            }
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol, n)) {
                return true;
            }
            if (solveMazeUtil(maze, x, y + 1, sol, n)) {
                return true;
            }
            if (solveMazeUtil(maze, x - 1, y, sol, n)) {
                return true;
            }
            if (solveMazeUtil(maze, x, y - 1, sol, n)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        int[][] sol = new int[n][n];
        if (solveMazeUtil(maze, 0, 0, sol, n)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No path found");
        }
        sc.close();
    }
}
