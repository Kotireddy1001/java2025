//Maximum Product Subarray

public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(nums[i], max * nums[i]), min * nums[i]);
            min = Math.min(Math.min(nums[i], temp * nums[i]), min * nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Max Product Subarray: " + maxProduct(arr));
    }
}
