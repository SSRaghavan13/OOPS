package stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import bst.TreeNode;

public class P5LevelOrderTraversal {
    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        Queue<TreeNode> current = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();
        current.add(root);
        while(!current.isEmpty()) {
            TreeNode top = current.poll();
            currList.add(top.val);
            if(top.left != null)
                next.add(top.left);
            if(top.right != null)
                next.add(top.right);
            if(current.isEmpty()) {
                current = next;
                next = new LinkedList<>();
                result.add(currList);
                currList = new ArrayList<>();
            }
        }
        return result;
    }
}