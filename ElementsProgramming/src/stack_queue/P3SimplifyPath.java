package stack_queue;

import java.util.Stack;

public class P3SimplifyPath {
    public static String simplifyPath(String path) {
        if(path.isEmpty())
            return path;
        Stack<String> stack = new Stack<>();
        for(String token : path.split("/")) {
            if(token.equals(".") || token.isEmpty())
                continue;
            else if(token.equals("..")) {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else {
                stack.push(token);
            }
        }

        StringBuilder simplePath = new StringBuilder();
        for(String token : stack) {
            simplePath.append("/");
            simplePath.append(token);
        }
        return simplePath.length() > 0 ? simplePath.toString() : "/" ;
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a//b////c/d//././/.."));
    }
}