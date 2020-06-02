package binarytree;

public class P3LowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        if(root == null)
            return null;
        if(root == node1 || root == node2)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, node1, node2);
        TreeNode right = lowestCommonAncestor(root.right, node1, node2);
        if(left == null && right == null)
            return null;
        if(left != null && right != null)
            return root;
        return left != null ? left : right;
    }

    public static TreeNodeParent lcaParentNodeGiven(TreeNodeParent root, TreeNodeParent node1, TreeNodeParent node2) {
        int node1Depth = depth(node1);
        int node2Depth = depth(node2);
        // Making node1 depth greater than node2 to simplify the code.
        if(node2Depth > node1Depth)
            return lcaParentNodeGiven(root, node2, node1);
        int depthDiff = Math.abs(node1Depth - node2Depth);
        while(depthDiff-- > 0)
            node1 = node1.parent;
        while(node1 != node2) {
            node1 = node1.parent;
            node2 = node2.parent;
        }
        return node1;
    }

    public static int depth(TreeNodeParent node) {
        int depth = 0;
        while(node.parent != null) {
            depth++;
            node = node.parent;
        }
        return depth;
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
        System.out.println(lowestCommonAncestor(root, l1l, l1));
        TreeNodeParent Proot = new TreeNodeParent(100);
        TreeNodeParent Pl1 = new TreeNodeParent(20);
        TreeNodeParent Pr1 = new TreeNodeParent(500);
        TreeNodeParent Pl1l = new TreeNodeParent(10);
        TreeNodeParent Pl1r = new TreeNodeParent(30);
        Proot.left = Pl1;
        Proot.right = Pr1;
        Proot.parent = null;
        Pl1.left = Pl1l;
        Pl1.right = Pl1r;
        Pl1.parent = Proot;
        Pl1l.left = null;
        Pl1l.right = null;
        Pl1l.parent = Pl1;
        Pl1r.left = null;
        Pl1r.right = null;
        Pl1r.parent = Pl1;
        Pr1.left = null;
        Pr1.right = null;
        Pr1.parent = Proot;
        System.out.println(lcaParentNodeGiven(Proot, Pl1l, Pl1));
        System.out.println(lcaParentNodeGiven(Proot, Pl1, Pl1l));
    }

}