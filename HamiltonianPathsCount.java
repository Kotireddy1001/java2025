//Count Hamiltonian Paths in Graph – DP + Bitmask


public class HamiltonianPathsCount {
    static int n;
    static int[][] graph;
    static long[][] dp;

    public static long countPaths(int mask, int u) {
        if (mask == (1 << n) - 1) return 1;
        if (dp[mask][u] != -1) return dp[mask][u];
        long ways = 0;
        for (int v = 0; v < n; v++) {
            if ((mask & (1 << v)) == 0 && graph[u][v] == 1) {
                ways += countPaths(mask | (1 << v), v);
            }
        }
        return dp[mask][u] = ways;
    }

    public static void main(String[] args) {
        graph = new int[][] {
            {0,1,1,0},
            {1,0,1,1},
            {1,1,0,1},
            {0,1,1,0}
        };
        n = graph.length;
        dp = new long[1<<n][n];
        for (long[] row : dp) java.util.Arrays.fill(row, -1);
        System.out.println(countPaths(1, 0)); // starting from node 0
    }
}
