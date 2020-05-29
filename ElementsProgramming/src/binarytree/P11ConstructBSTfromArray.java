package binarytree;

import java.util.Stack;

public class P11ConstructBSTfromArray {
    public static TreeNode sortedArrToBST(int[] nums) {
        return sortedArrToBSTHelper(0, nums.length - 1, nums);
    }

    public static TreeNode sortedArrToBSTHelper(int left, int right, int[] nums) {
        if(left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = sortedArrToBSTHelper(left, mid - 1, nums);
        newNode.right = sortedArrToBSTHelper(mid + 1, right, nums);
        return newNode;
    }

    public static TreeNode arrToPreOrder(int[] nums) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(nums[0]);
        stack.push(root);
        for(int i = 1; i < nums.length; i++) {
            TreeNode temp = null;
            while(!stack.isEmpty() && nums[i] > stack.peek().val)
                temp = stack.pop();
            if(temp == null) {
                temp = stack.pop();
                temp.left = new TreeNode(nums[i]);
                stack.push(temp.left);
            }
            else {
                temp.right = new TreeNode(nums[i]);
                stack.push(temp.right);
            }
        }
        return root;
    }

}