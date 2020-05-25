package binarytree;

import java.util.ArrayList;
import java.util.List;

public class P4RootToLeafSum {
    public static void rootToLeafSumBinaryDigits(TreeNode root) {
        List<String> result = new ArrayList<>();
        calculateAllNumbers(root, "", result);
        for(String str : result)
            System.out.println(str);
    }

    public static void calculateAllNumbers(TreeNode root, String numSoFar, List<String> result) {
        if(root == null) {
            return;
        }
        numSoFar = Integer.toString(root.val) + numSoFar;
        if(root.left == null && root.right == null) {
            result.add(numSoFar);
        }
        calculateAllNumbers(root.left, numSoFar, result);
        calculateAllNumbers(root.right, numSoFar, result);
    }

    public static int rootToLeafSum(TreeNode root) {
        return sumAllNumbers(root, 0);
    }

    public static int sumAllNumbers(TreeNode root, int sumSoFar) {
        if(root == null)
            return 0;
        sumSoFar = sumSoFar * 2 + root.val;
        if(root.left == null && root.right == null)
            return sumSoFar;
        return sumAllNumbers(root.left, sumSoFar) + sumAllNumbers(root.right, sumSoFar);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(0);
        TreeNode c = new TreeNode(0);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(1);
        TreeNode f = new TreeNode(1);
        TreeNode g = new TreeNode(1);
        TreeNode h = new TreeNode(0);
        TreeNode i = new TreeNode(1);
        TreeNode j = new TreeNode(0);
        TreeNode k = new TreeNode(0);
        TreeNode l = new TreeNode(1);
        TreeNode m = new TreeNode(1);
        TreeNode n = new TreeNode(0);
        TreeNode o = new TreeNode(0);
        TreeNode p = new TreeNode(0);
        a.left = b;
        a.right = i;
        b.left = c;
        b.right = f;
        c.left = d;
        c.right = e;
        d.left = null;
        d.right = null;
        e.left = null;
        e.right = null;
        f.left = null;
        f.right = g;
        g.left = h;
        g.right = null;
        h.left = null;
        h.right = null;
        i.left = j;
        i.right = o;
        j.left = null;
        j.right = k;
        k.left = l;
        k.right = n;
        l.left = null;
        l.right = m;
        m.left = null;
        m.right = null;
        n.left = null;
        n.right = null;
        o.left = null;
        o.right = p;
        p.left = null;
        p.right = null;
        rootToLeafSumBinaryDigits(a);
        System.out.println(rootToLeafSum(a));
    }

}