// Find Missing Number (XOR Method)

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) xor ^= i ^ nums[i];
        return xor ^ nums.length;
    }
}
