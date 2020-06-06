package binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P13PreorderWithMarkers {
    int preIndex = 0;

    public TreeNode constructTree(List<Integer> preorder) {
        return helper(preorder);
    }

    public TreeNode helper(List<Integer> preorder) {
        Integer rootVal = preorder.get(preIndex++);

        if(rootVal == null)
            return null;
        
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(preorder);
        root.right = helper(preorder);
        return root;
    }

    public static void main(String[] args) {
        List<Integer> preorder = new ArrayList<>(Arrays.asList(8, 2, 6, null, null, 5, 1, null, null, null, 3, null, 4, null, 7, 9, null, null, null));
        P13PreorderWithMarkers preOrderTree = new P13PreorderWithMarkers();
        System.out.println(preOrderTree.constructTree(preorder));
    }

}