package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P8PostOrderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.add(root);
        while(!s1.isEmpty()) {
            TreeNode top = s1.pop();
            s2.add(top);
            if(top.left != null)
                s1.add(top.left);
            if(top.right != null)
                s1.add(top.right);
        }
        while(!s2.isEmpty()) {
            result.add(s2.pop().val);
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
        List<Integer> result = postorderTraversal(root);
        for(int i : result)
            System.out.println(i);
    }
}