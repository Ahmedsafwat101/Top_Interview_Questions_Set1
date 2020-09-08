package Others;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() == 1) return false;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.add(ch);
            } else {
                if (stack.size() == 0) return false;
                else {
                    if (ch == ')' && stack.peek() != '(') return false;
                    else if (ch == '}' && stack.peek() != '{') return false;
                    else if (ch == ']' && stack.peek() != '[') return false;
                    stack.pop();
                }
            }

        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
