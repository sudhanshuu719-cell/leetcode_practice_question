import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (!stack.isEmpty()) {
                    result.append(c);
                }
                stack.push(c);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())")); // "()()()"
    }
}
