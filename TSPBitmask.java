//Travelling Salesman Problem (TSP) – DP with Bitmask

public class TSPBitmask {
    static int n;
    static int[][] dist;
    static int[][] dp;

    public static int tsp(int mask, int pos) {
        if (mask == (1 << n) - 1) return dist[pos][0];
        if (dp[mask][pos] != -1) return dp[mask][pos];
        int ans = Integer.MAX_VALUE;
        for (int city = 0; city < n; city++) {
            if ((mask & (1 << city)) == 0) {
                int newAns = dist[pos][city] + tsp(mask | (1 << city), city);
                ans = Math.min(ans, newAns);
            }
        }
        return dp[mask][pos] = ans;
    }

    public static void main(String[] args) {
        dist = new int[][] {
            {0, 20, 42, 25},
            {20, 0, 30, 34},
            {42, 30, 0, 10},
            {25, 34, 10, 0}
        };
        n = dist.length;
        dp = new int[1 << n][n];
        for (int[] row : dp) java.util.Arrays.fill(row, -1);
        System.out.println("TSP min cost = " + tsp(1, 0)); // 85
    }
}
