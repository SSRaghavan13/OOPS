package stack_queue;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() < nums[i])
                stack.pop();
            if(stack.empty())
                result[i] = -1;
            else
                result[i] = stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {4,1,3,6,2};
        int[] result = nextGreaterElement(nums);
        for(int n: result)
            System.out.println(n);
    }
}