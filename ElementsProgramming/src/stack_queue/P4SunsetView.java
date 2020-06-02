package stack_queue;

import java.util.Stack;

public class P4SunsetView {
    public static Stack<Integer> buildingsWithSunsetView(int[] height) {
        Stack<Integer> stack = new Stack<>();
        for(int i = height.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && height[i] > stack.peek())
                stack.pop();
            stack.add(height[i]);
        }
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = buildingsWithSunsetView(new int[] {7, 4, 8, 2, 9});
        for(int a : stack)
            System.out.println(a);
    }
}