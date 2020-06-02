package binarytree;

public class P5RootToLeafSum {
    public static boolean rootToLeafSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null) {
            return sum == root.val;
        }
        return (rootToLeafSum(root.left, sum - root.val)) || (rootToLeafSum(root.right, sum - root.val));
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
        System.out.println(rootToLeafSum(root, 130));
        System.out.println(rootToLeafSum(root, 500));
    }

}