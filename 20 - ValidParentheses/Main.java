import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // isValid("()");
        // isValid("()[]{}");
        // isValid("(]");
        // isValid("((");
        // System.out.println(isValid("){"));
        // System.out.println(isValid("))"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> parenthesesStack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                parenthesesStack.push(c);
            } else {
                if (parenthesesStack.size() == 0) {
                    return false;
                }

                char cc = parenthesesStack.pop();
                if (c == ')' && cc != '(') {
                    return false;
                } else if (c == '}' && cc != '{') {
                    return false;
                } else if (c == ']' && cc != '[') {
                    return false;
                }
            }
        }

        if (parenthesesStack.size() != 0) {
            return false;
        }
        
        return true;
    }
}
