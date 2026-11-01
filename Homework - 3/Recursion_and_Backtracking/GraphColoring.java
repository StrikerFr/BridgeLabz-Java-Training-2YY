import java.util.Scanner;

public class GraphColoring {
    public static boolean isSafe(int v, int[][] graph, int[] color, int c) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i] == 1 && color[i] == c) {
                return false;
            }
        }
        return true;
    }

    public static boolean graphColoringUtil(int[][] graph, int m, int[] color, int v) {
        if (v == graph.length) {
            return true;
        }
        for (int c = 1; c <= m; c++) {
            if (isSafe(v, graph, color, c)) {
                color[v] = c;
                if (graphColoringUtil(graph, m, color, v + 1)) {
                    return true;
                }
                color[v] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int m = sc.nextInt();
        int[][] graph = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        int[] color = new int[vertices];
        if (graphColoringUtil(graph, m, color, 0)) {
            for (int i = 0; i < vertices; i++) {
                System.out.print(color[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("No solution");
        }
        sc.close();
    }
}
