//Count Palindromic Subsequences

public class PalindromicSubsequences {
    public static int countPalindromes(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if (i == j) dp[i][j] = 1;
                else if (s.charAt(i) == s.charAt(j)) dp[i][j] = dp[i+1][j] + dp[i][j-1] + 1;
                else dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
            }
        }
        return dp[0][n-1];
    }

    public static void main(String[] args) {
        System.out.println(countPalindromes("aaa")); // 6
    }
}
