// Find First Non-Repeating Character


import java.util.*;

public class FirstNonRepeating {
    public static char firstNonRepeat(String s) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> entry : freq.entrySet())
            if (entry.getValue() == 1) return entry.getKey();
        return '_';
    }

    public static void main(String[] args) {
        System.out.println("First Non-Repeating: " + firstNonRepeat("swiss"));
    }
}
