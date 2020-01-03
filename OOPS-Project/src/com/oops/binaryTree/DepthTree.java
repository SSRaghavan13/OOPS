package com.oops.binaryTree;

public class DepthTree {
	int answer;
	//Top-down solution (Preorder)
	private void maximum_depth(TreeNode root, int depth) {
		if(root == null)
			return;
		if(root.left == null && root.right == null) {
			answer = Math.max(answer, depth);
		}
		maximum_depth(root.left, depth + 1);
		maximum_depth(root.right, depth + 1);
	}
	//Bottom-up solution (Postorder)
	public int maximum_depth(TreeNode root) {
		if(root == null)
			return 0;
		int left_depth = maximum_depth(root.left);
		int right_depth = maximum_depth(root.right);
		return (Math.max(left_depth, right_depth) + 1);
	}
}
