// Target Sum (Count ways to reach target using +/– signs)

public class TargetSumWays {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n : nums) sum += n;
        if ((sum + target) % 2 != 0 || target > sum) return 0;
        int s1 = (sum + target) / 2;

        int[] dp = new int[s1 + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = s1; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[s1];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println("Target Sum Ways: " + findTargetSumWays(nums, target));
    }
}
