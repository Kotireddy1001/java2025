//Integer Break (Split number to maximize product)

public class IntegerBreak {
    public static int maxProduct(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 1; j < i; j++)
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Max Product: " + maxProduct(10));
    }
}
