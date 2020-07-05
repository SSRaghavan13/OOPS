package com.oops.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort {
    public void topologicalSort(int[][] adj) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        for(int i = 0; i < adj.length; i++) {
            if(!visited.contains(i))
                dfs(adj, i, visited, stack);
        }
        List<Integer> order = new ArrayList<>();
        while(!stack.isEmpty())
            order.add(stack.pop());
    }

    public void dfs(int[][] adj, int node, Set<Integer> visited, Stack<Integer> stack) {
        visited.add(node);
        for(int i = 0; i < adj[node].length; i++) {
            if(!visited.contains(node) && adj[node][i] == 1)
                dfs(adj, i, visited, stack);
        }
        stack.add(node);
    }
}