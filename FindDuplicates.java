//Find All Duplicates in Array

import java.util.*;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            int idx = Math.abs(num) - 1;
            if (nums[idx] < 0) result.add(idx + 1);
            else nums[idx] *= -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Duplicates: " + findDuplicates(nums));
    }
}
