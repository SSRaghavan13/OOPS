package com.oops.BST;

public class LeastCommonAncestor {
	public TreeNode leastCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root.val > p.val && root.val > q.val)
			return leastCommonAncestor(root.left, p, q);
		else if(root.val < p.val && root.val < q.val)
			return leastCommonAncestor(root.right, p, q);
		else
			return root;
	}
}