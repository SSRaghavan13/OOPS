package binarytree;

import java.util.HashMap;
import java.util.Map;

public class P12BSTPreorderInorderArray {
    Map<Integer, Integer> map = new HashMap<>();
    int pre_index = 0;
    int[] preorder;
    int[] inorder;

    public TreeNode helper(int in_left, int in_right) {
        // If no element to construct
        if(in_left == in_right)
            return null;
        
        // Find the index in preorder as root
        int root_val = preorder[pre_index];
        TreeNode root = new TreeNode(root_val);

        // Split the inorder array at index of root in inorder
        int index = map.get(root_val);

        // Move to the next root in preorder
        pre_index++;
        root.left = helper(in_left, index);
        root.right = helper(index + 1, in_right);
        
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

        int index = 0;
        for(int val: inorder)
            this.map.put(val, index++);
        return helper(0, inorder.length);
    }

    public static void main(String[] args) {
        P12BSTPreorderInorderArray test = new P12BSTPreorderInorderArray();
        int[] inorder = {3,9,20,15,7};
        int[] preorder = {9,3,15,20,7};
        test.buildTree(preorder, inorder);
    }
}