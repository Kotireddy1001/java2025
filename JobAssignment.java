//Bitmask DP – Assign Jobs to Minimize Cost

public class JobAssignment {
    static int n;
    static int[][] cost;
    static int[] dp;

    public static int solve(int mask) {
        int i = Integer.bitCount(mask);
        if (i == n) return 0;
        if (dp[mask] != -1) return dp[mask];
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if ((mask & (1 << j)) == 0) {
                ans = Math.min(ans, cost[i][j] + solve(mask | (1 << j)));
            }
        }
        return dp[mask] = ans;
    }

    public static void main(String[] args) {
        cost = new int[][] {
            {9,2,7,8},
            {6,4,3,7},
            {5,8,1,8},
            {7,6,9,4}
        };
        n = cost.length;
        dp = new int[1<<n];
        java.util.Arrays.fill(dp, -1);
        System.out.println(solve(0)); // 13
    }
}
