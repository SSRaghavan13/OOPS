package com.oops.graph;

import java.util.Iterator;
import java.util.LinkedList;

import com.oops.graph.GraphDemo.Graph;

public class DFSDemo {
	void DFS(int n, LinkedList<Integer>[] adjListArray, boolean[] visited) {
		visited[n] = true;
		System.out.print(n + " ");
		Iterator<Integer> i = adjListArray[n].listIterator();
		while(i.hasNext()) {
			int v = i.next();
			if(!visited[v]) {
				DFS(v, adjListArray, visited);
			}
		}
	}
	
	public static void main(String[] args) {
		Graph graph = new GraphDemo.Graph(4);		  
		GraphDemo.addEdge(graph, 0, 1); 
		GraphDemo.addEdge(graph, 0, 2); 
		GraphDemo.addEdge(graph, 1, 2); 
		GraphDemo.addEdge(graph, 2, 0); 
		GraphDemo.addEdge(graph, 2, 3); 
		GraphDemo.addEdge(graph, 3, 3); 
		boolean visited[] = new boolean[5];
		LinkedList<Integer> adjListArray[] = graph.adjListArray;
		System.out.println("Following is Depth First Traversal "+ 
                "(starting from vertex 2)");
        DFSDemo dfs = new DFSDemo();
        dfs.DFS(2, adjListArray, visited); 
	}
}
