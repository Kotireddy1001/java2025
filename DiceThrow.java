//Dice Throw – Count ways

public class DiceThrow {
    public static int countWays(int dice, int faces, int sum) {
        int[][] dp = new int[dice + 1][sum + 1];
        dp[0][0] = 1;
        for (int d = 1; d <= dice; d++) {
            for (int s = 1; s <= sum; s++) {
                for (int f = 1; f <= faces && f <= s; f++) {
                    dp[d][s] += dp[d-1][s-f];
                }
            }
        }
        return dp[dice][sum];
    }

    public static void main(String[] args) {
        System.out.println(countWays(2, 6, 7)); // 6
    }
}
