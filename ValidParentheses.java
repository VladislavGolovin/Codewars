import java.util.Stack;

/*
    Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return true if the string is valid, and false if it's invalid.
    Examples

    "()"              =>  true
    ")(()))"          =>  false
    "("               =>  false
    "(())((()())())"  =>  true

    Constraints

    0 <= input.length <= 100

    Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters. Furthermore, the input string may be empty and/or not contain any parentheses at all. Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).
 */

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
