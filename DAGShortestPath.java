//Shortest Path in DAG – DP

import java.util.*;

public class DAGShortestPath {
    static class Edge {
        int v, w;
        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public static int[] shortestPath(int n, List<List<Edge>> adj, int src) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) topo(i, adj, visited, stack);
        }

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (dist[u] != Integer.MAX_VALUE) {
                for (Edge e : adj.get(u)) {
                    if (dist[u] + e.w < dist[e.v]) {
                        dist[e.v] = dist[u] + e.w;
                    }
                }
            }
        }
        return dist;
    }

    private static void topo(int u, List<List<Edge>> adj, boolean[] visited, Stack<Integer> stack) {
        visited[u] = true;
        for (Edge e : adj.get(u)) {
            if (!visited[e.v]) topo(e.v, adj, visited, stack);
        }
        stack.push(u);
    }

    public static void main(String[] args) {
        int n = 6;
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Edge(1, 5));
        adj.get(0).add(new Edge(2, 3));
        adj.get(1).add(new Edge(3, 6));
        adj.get(1).add(new Edge(2, 2));
        adj.get(2).add(new Edge(4, 4));
        adj.get(2).add(new Edge(5, 2));
        adj.get(2).add(new Edge(3, 7));
        adj.get(3).add(new Edge(4, -1));
        adj.get(4).add(new Edge(5, -2));

        System.out.println(Arrays.toString(shortestPath(n, adj, 1)));
    }
}
