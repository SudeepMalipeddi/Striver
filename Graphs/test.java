package Graphs;

import java.util.*;

public class test {

    public void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> arr) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        for (int x : arr.get(node)) {
            dfs(x, visited, arr);
        }

    }

    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, adjList);
                count++;
            }
        }
        return count;
    }
}
