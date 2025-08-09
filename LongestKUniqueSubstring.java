//Find Longest Substring with K Unique Characters

import java.util.*;

public class LongestKUniqueSubstring {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(findLongest(s, k));
    }

    public static String findLongest(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0, start = 0;
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.size() > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));
                left++;
            }
            if (map.size() == k && (right - left + 1) > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }
        return s.substring(start, start + maxLen);
    }
}
