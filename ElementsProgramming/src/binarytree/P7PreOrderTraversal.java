package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P7PreOrderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()) {
            TreeNode top = stack.pop();
            result.add(top.val);
            if(top.right != null)
                stack.add(top.right);
            if(top.left != null)
                stack.add(top.left);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        TreeNode l1 = new TreeNode(20);
        TreeNode r1 = new TreeNode(500);
        TreeNode l1l = new TreeNode(10);
        TreeNode l1r = new TreeNode(30);
        root.left = l1;
        root.right = r1;
        l1.left = l1l;
        l1.right = l1r;
        l1l.left = null;
        l1l.right = null;
        l1r.left = null;
        l1r.right = null;
        r1.left = null;
        r1.right = null;
        List<Integer> result = preorderTraversal(root);
        for(int i : result)
            System.out.println(i);
    }
}