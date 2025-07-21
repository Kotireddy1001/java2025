package Practice;

public class StringAnalyzer {
    public static void main(String[] args) {
        String sentence = "Java Programming";

        int length = sentence.length();
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(length - 1);

        System.out.println("Length: " + length);
        System.out.println("First Char: " + firstChar);
        System.out.println("Last Char: " + lastChar);
    }
}
