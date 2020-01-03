package com.oops.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
	public boolean hasSum(TreeNode root, int sum, List<TreeNode> list){
		if(root == null)
			return false;
		if(root.left == null && root.right == null) {
			if(root.val == sum) {
				list.add(root);
				return true;
			}
		}
		
		if(hasSum(root.left, sum - root.val, list)) {
			list.add(root);
			return true;
		}
		if(hasSum(root.right, sum - root.val, list)) {
			list.add(root);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		/*
		 * BinaryTree bt = new BinaryTree();
        Node head = null;
        head = bt.addNode(10, head);
        head = bt.addNode(15, head);
        head = bt.addNode(5, head);
        head = bt.addNode(7, head);
        head = bt.addNode(19, head);
        head = bt.addNode(20, head);
        head = bt.addNode(4, head);
        head = bt.addNode(3, head);
        List<Node> result = new ArrayList<>();
        boolean r = rtl.hasSum(head, 22, result);
		 * 
		 */
	}
}
