package stack_queue;

import java.util.Stack;

public class P1PostfixEval {
    public static int reversePolishNotation(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] symbols = expr.split(",");
        for(String token : symbols) {
            if(token.length() == 1 && "+-*/".contains(token)) {
                int second = stack.pop();
                int first = stack.pop();
                int tempResult = 0;
                switch(token.charAt(0)) {
                    case '+': 
                    tempResult = first + second;
                    break;
                    case '-':
                    tempResult = first - second;
                    break;
                    case '*':
                    tempResult = first * second;
                    break;
                    case '/':
                    tempResult = first / second;
                    break;
                }
                stack.push(tempResult);
            }
            else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "3,1,+,2,*";
        System.out.println(reversePolishNotation(expr));
    }
}