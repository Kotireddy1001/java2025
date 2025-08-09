//Find First Non-Repeating Character

import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(findFirstNonRepeating(s));
    }

    public static char findFirstNonRepeating(String s) {
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : s.toCharArray()) count.put(c, count.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> e : count.entrySet())
            if (e.getValue() == 1) return e.getKey();
        return '_';
    }
}
