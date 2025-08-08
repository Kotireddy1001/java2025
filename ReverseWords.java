//Reverse Words in a Sentence

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            sb.append(words[i]).append(" ");
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String input = "  Hello   World  ";
        System.out.println("Reversed: '" + reverseWords(input) + "'");
    }
}
