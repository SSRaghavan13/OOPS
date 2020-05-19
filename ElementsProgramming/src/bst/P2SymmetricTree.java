package bst;

public class P2SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return root == null || checkSymmetry(root.left, root.right);
    }

    public static boolean checkSymmetry(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        else if(left == null || right == null)
            return false;
        if((left.val == right.val) && checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left))
            return true;
        return false;
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
        System.out.println(isSymmetric(root));
    }
}