package com.oops.binaryTree;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return (root == null && checkSymmetry(root.left, root.right));
	}
	
	public boolean checkSymmetry(TreeNode left, TreeNode right) {
		if(left == null && right == null)
			return true;
		else if(left != null && right != null) {
			return ((left.val == right.val) && checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left));
		}
		return false;
	}
}
