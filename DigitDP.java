//Digit DP – Count numbers with no consecutive digits equal

public class DigitDP {
    static int[][] dp;
    static char[] digits;

    public static int solve(int pos, int prev, boolean tight) {
        if (pos == digits.length) return 1;
        if (!tight && dp[pos][prev+1] != -1) return dp[pos][prev+1];
        int limit = tight ? digits[pos] - '0' : 9;
        int ans = 0;
        for (int dig = 0; dig <= limit; dig++) {
            if (dig != prev) {
                ans += solve(pos+1, dig, tight && (dig == limit));
            }
        }
        if (!tight) dp[pos][prev+1] = ans;
        return ans;
    }

    public static int countNoRepeat(int num) {
        digits = String.valueOf(num).toCharArray();
        dp = new int[digits.length][11]; // prev=-1 mapped to index 0
        for (int[] row : dp) java.util.Arrays.fill(row, -1);
        return solve(0, -1, true);
    }

    public static void main(String[] args) {
        System.out.println(countNoRepeat(100)); 
    }
}
