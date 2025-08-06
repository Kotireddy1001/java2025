public class SubsetSum {
    public static boolean isSubsetSum(int[] nums, int sum) {
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) dp[i][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= sum; s++) {
                if (nums[i - 1] <= s)
                    dp[i][s] = dp[i - 1][s] || dp[i - 1][s - nums[i - 1]];
                else
                    dp[i][s] = dp[i - 1][s];
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println("Subset with sum exists: " + isSubsetSum(nums, sum));
    }
}
