//Check Balanced Parentheses Using Stack

import java.util.*;

public class BalancedParentheses2 {
    public static void main(String[] args) {
        String expr = "{[()]}";
        System.out.println(isBalanced(expr));
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ("([{".indexOf(c) != -1) stack.push(c);
            else if (stack.isEmpty() || !isMatching(stack.pop(), c)) return false;
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
