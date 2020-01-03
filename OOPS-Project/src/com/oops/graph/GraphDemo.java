package com.oops.graph;

import java.util.LinkedList;

public class GraphDemo {
	static class Graph {
		int v;
		LinkedList<Integer> adjListArray[];
		
		Graph(int v) {
			this.v = v;
			adjListArray = new LinkedList[v];
		
			for(int i = 0; i < v; i++) {
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	static void addEdge(Graph graph, int src, int dest) {	 
		graph.adjListArray[src].add(dest);
		
		// Since graph is unidirectional, add edge from dest to src
		graph.adjListArray[dest].add(src);
	}
	
	static void printGraph(Graph graph) {
		for(int i = 0; i < graph.v; i++) {
			System.out.println("Adjacency list of vertex "+ i); 
            System.out.print("head"); 
            for(Integer num: graph.adjListArray[i]){ 
                System.out.print(" -> "+num); 
            } 
            System.out.println("\n"); 
        } 
	}
	
	public static void main(String[] args) {
        Graph graph = new Graph(5); 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        printGraph(graph); 
	}
}