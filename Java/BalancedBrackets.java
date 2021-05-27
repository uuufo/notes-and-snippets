import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                char e = 0;
                if (!stack.isEmpty()) {
                    e = stack.pop();
                }
                if (c != e) {
                    return "NO";
                } else if (stack.isEmpty() && i == s.length() - 1) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
