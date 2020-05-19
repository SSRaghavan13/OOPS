package stack_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P2ValidParenthesis {
    public static boolean isValid(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char nextEle = str.charAt(i);
            if(!map.containsKey(nextEle))
                stack.push(nextEle);
            else {
                char top = stack.isEmpty() ? '@' : stack.pop();
                if(top != map.get(nextEle))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[()[]{()()}]"));
        System.out.println(isValid("[()[]{()()"));
    }
}