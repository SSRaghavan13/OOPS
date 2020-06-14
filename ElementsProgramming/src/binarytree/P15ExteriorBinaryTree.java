package binarytree;

import java.util.ArrayList;
import java.util.List;

public class P15ExteriorBinaryTree {
    
    public static List<Integer> treeExterior(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root != null) {
            result.add(root.val);
            result.addAll(leftView(root.left, true));
            result.addAll(rightView(root.right, true));
        }
        return result;
    }

    public static List<Integer> leftView(TreeNode node, boolean isBoundary) {
        List<Integer> leftView = new ArrayList<>();
        if(node != null) {
            if(isBoundary || (node.left == null && node.right == null))
                leftView.add(node.val);
            leftView.addAll(leftView(node.left, isBoundary));
            leftView.addAll(leftView(node.right, isBoundary && node.left == null));
        }
        return leftView;
    }

    public static List<Integer> rightView(TreeNode node, boolean isBoundary) {
        List<Integer> rightView = new ArrayList<>();
        if(node != null) {
            rightView.addAll(rightView(node.left, isBoundary && node.right == null));
            rightView.addAll(rightView(node.right, isBoundary));
            if(isBoundary || (node.left == null && node.right == null))
                rightView.add(node.val);
        }
        return rightView;
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
        List<Integer> result = treeExterior(root);
        for(int num: result)
            System.out.println(num);
    }

}