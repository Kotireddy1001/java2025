//Detect Cycle in a Directed Graph (DFS)

import java.util.*;

public class CycleDirectedGraph {
    static boolean dfs(int node, List<List<Integer>> adj, boolean[] visited, boolean[] recStack) {
        visited[node] = recStack[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor] && dfs(neighbor, adj, visited, recStack))
                return true;
            else if (recStack[neighbor])
                return true;
        }
        recStack[node] = false;
        return false;
    }

    public static boolean hasCycle(int v, List<List<Integer>> adj) {
        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i] && dfs(i, adj, visited, recStack)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0); // cycle
        System.out.println("Has Cycle: " + hasCycle(v, adj));
    }
}
