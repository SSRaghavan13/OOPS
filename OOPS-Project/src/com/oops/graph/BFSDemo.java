package com.oops.graph;

import java.util.Iterator;
import java.util.LinkedList;

import com.oops.graph.GraphDemo.Graph;

public class BFSDemo {

	void BFS(int n, Graph graph) {
		boolean visited[] = new boolean[n];
		LinkedList<Integer> queue = new LinkedList<>();
		LinkedList<Integer> adjListArray[] = graph.adjListArray;
		visited[n] = true;
		queue.add(n);
		while(queue.size() != 0) {
			n = queue.poll();
			System.out.print(n + " ");
			Iterator<Integer> i = adjListArray[n].listIterator();
			while(i.hasNext()) {
				int a = i.next();
				if(!visited[a]) {
					visited[a] = true;
					queue.add(a);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Graph graph = new GraphDemo.Graph(5);		  
		GraphDemo.addEdge(graph, 0, 1); 
		GraphDemo.addEdge(graph, 0, 2); 
		GraphDemo.addEdge(graph, 1, 2); 
		GraphDemo.addEdge(graph, 2, 0); 
		GraphDemo.addEdge(graph, 2, 3); 
		GraphDemo.addEdge(graph, 3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
        BFSDemo bfs = new BFSDemo();
        bfs.BFS(2, graph); 
	}
}
