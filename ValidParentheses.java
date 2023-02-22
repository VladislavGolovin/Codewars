import java.util.Stack;

class ValidParentheses {

    public static void main(String[] args) {

        String parens = "32423(sgsdg)";

        if (!isParenthesesValid(parens)) {
            System.err.println("Parentheses is not valid");   
        }
    }
    
    public static boolean isParenthesesValid(String parens) {

        Stack<Character> stack = new Stack<>();
        
        for (char c : parens.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ')') {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
