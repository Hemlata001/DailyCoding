import java.util.Stack;

public class InfixToPostfix {
    static int prec(char c) {
        if (c == '^') return 3;
        else if (c == '/' || c == '*') return 2;
        else if (c == '+' || c == '-') return 1;
        else return -1;
    }

    static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            
            // If the scanned character is an operand, 
            // add it to the output string.
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            } 
            
            // If the scanned character is an ‘(‘, 
            // push it to the stack.
            else if (c == '(') {
                st.push(c);
            } 
            
            // If the scanned character is an ‘)’,
            // pop and add to the output string from the stack
            // until an ‘(‘ is encountered.
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                st.pop();
            } 
            
            // If an operator is scanned
            else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    res.append(st.pop());
                }
                st.push(c);
            }
        }

        // Pop all the remaining elements from the stack
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
