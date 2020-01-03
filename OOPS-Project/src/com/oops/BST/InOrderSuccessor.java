package com.oops.BST;

public class InOrderSuccessor {
	public TreeNode inOrderSuccessor (TreeNode root, TreeNode p) {
		if(root == null)
			return root;
		TreeNode prev = null;
		TreeNode current = root;
		while(current != null && current.val != p.val) {
			if(current.val > p.val) {
				prev = current;
				current = current.left;
			}
			else
				current = current.right;
		}
		
		if(current.right == null)
			return prev;
		
		current = current.right;
		while(current.left != null)
			current = current.left;
		
		return current;
	}
}
