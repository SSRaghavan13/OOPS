package com.oops.BST;

public class InsertBST {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if(root == null)
			return new TreeNode(val);
		if(val < root.val) {
			if(root.left == null)
				root.left = new TreeNode(val);
			else
				insertIntoBST(root.left, val);
		}
		else if(val > root.val) {
			if(root.right == null)
				root.right = new TreeNode(val);
			else
				insertIntoBST(root.right, val);
		}
		return root;
	}
}
