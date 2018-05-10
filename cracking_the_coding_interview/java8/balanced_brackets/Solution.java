import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isOpenBracket(Character symbol) {
        return symbol == '[' || symbol == '(' || symbol == '{';
    }
    
    public static boolean isMatch(Character open, Character close) {
        if (open == '{') return close == '}';
        if (open == '(') return close == ')';
        return close == ']';
    }
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < expression.length(); i++) {
            Character bracket = new Character(expression.charAt(i));
            // if open bracket => push to stack
            if (isOpenBracket(bracket)) {
                stack.push(bracket);
            }
            // close bracket but nothing on stack
            else if (stack.empty()) {
                return false;
            }
            // close bracket not match the open bracket on top
            else if (!isMatch(stack.pop(), bracket)) {
                return false;
            }
        }
        // end of input, if stack not empty => still have unclosed bracket
        return stack.empty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
