package bst;

public class P1BalancedBST {
    public static boolean isBalanced(TreeNode root) {
        return checkBalanced(root);
    }

    public static boolean checkBalanced(TreeNode root) {
        if(root == null)
            return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;
        return checkBalanced(root.left) && checkBalanced(root.right);
    }

    public static int height(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return (Math.max(leftHeight, rightHeight) + 1);
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
        System.out.println(isBalanced(root));
    }
}