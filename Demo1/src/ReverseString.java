//Reverse a String using Recursion

public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "AdvancedJava";
        System.out.println("Reversed: " + reverse(input));
    }
}
