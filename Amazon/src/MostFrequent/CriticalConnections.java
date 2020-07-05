package MostFrequent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnections {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();
        
        for(List<Integer> connection: connections) {
            graph[connection.get(0)].add(connection.get(1));
            graph[connection.get(1)].add(connection.get(0));
        }

        int[] key = new int[n];
        for(int i = 0; i < n; i++)
            key[i] = n;
        
        List<List<Integer>> result = new ArrayList<>();
        dfs(graph, 0, -1, 0, key, n, result);
        return result;
    }

    public int dfs(List<Integer>[] graph, int node, int parent, int discovery_time, int[] key, int n, List<List<Integer>> result) {
        if(key[node] == n) {
            key[node] = discovery_time;

            for(int neighbour: graph[node]) {
                if(neighbour != parent) {
                    int actual_time = dfs(graph, neighbour, node, discovery_time + 1, key, n, result);
                    if(actual_time >= discovery_time + 1)
                        result.add(Arrays.asList(node, neighbour));
                    
                    key[node] = Math.min(key[node], actual_time);
                }
            }
        }
        return key[node];
    }

    public static void main(String[] args) {
        CriticalConnections criticalConnections = new CriticalConnections();
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));
        List<List<Integer>> result = criticalConnections.criticalConnections(4, connections);
        for(List<Integer> connection: result) {
            for(int node: connection)
                System.out.print(node + " ");
            System.out.println();
        }
    }
}