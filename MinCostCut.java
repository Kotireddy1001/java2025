//Minimum Cost to Cut a Stick – Interval DP

import java.util.Arrays;

public class MinCostCut {
    public static int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] arr = new int[m + 2];
        arr[0] = 0; arr[m + 1] = n;
        System.arraycopy(cuts, 0, arr, 1, m);
        Arrays.sort(arr);
        int[][] dp = new int[m + 2][m + 2];
        for (int len = 2; len < m + 2; len++) {
            for (int i = 0; i + len < m + 2; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], arr[j] - arr[i] + dp[i][k] + dp[k][j]);
                }
                if (dp[i][j] == Integer.MAX_VALUE) dp[i][j] = 0;
            }
        }
        return dp[0][m + 1];
    }

    public static void main(String[] args) {
        System.out.println(minCost(9, new int[]{5, 6, 1, 4, 2})); // 22
    }
}
