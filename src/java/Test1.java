package java;

import java.util.Stack;

public class Test1 {
    //{{}(})
    public static void main(String[] args) {
        System.out.println(isBalancedString("[*]"));
    }

    public static boolean isBalancedString(String s){
        Stack<Character> stack = new Stack<>();
        //{*()
        for (char ch : s.toCharArray()) {
            if(ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']' || ch == '*') {
                if(stack.isEmpty() || !isMatched(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        boolean flag = stack.isEmpty();
        for (char c: stack){
            if(c == '*'){
                flag = !flag;
            }
        }


        return flag;
    }

    private static boolean isMatched(char open, char close){
        return (open == '{' && (close == '}' || close == '*')) ||
                (open == '(' && (close == ')' || close == '*')) ||
                (open == '[' && (close == ']' || close == '*'));
    }








}
