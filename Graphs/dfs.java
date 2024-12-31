package Graphs;

import java.util.ArrayList;

public class dfs {
    public static void depthfs(int vertex, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, boolean[] vis) {
        vis[vertex] = true;
        res.add(vertex);

        for (Integer x : adj.get(vertex)) {
            if (vis[vertex] == false) {
                depthfs(x, adj, res, vis);
            }
        }
    }

    public static ArrayList<Integer> depthFirstSearch(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();

        boolean[] vis = new boolean[adj.size()];
        depthfs(0, adj, res, vis);
        return res;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        adj.add(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(0);
        adj.add(l2);
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(0);
        adj.add(l3);
        ArrayList<Integer> l4 = new ArrayList<>();
        // l4.add(1);
        l4.add(4);
        adj.add(l4);
        ArrayList<Integer> l5 = new ArrayList<>();
        l5.add(0);
        l5.add(3);
        adj.add(l5);
        // ArrayList<Integer> l6 = new ArrayList<>();
        // l6.add(3);
        // adj.add(l6);

        ArrayList<Integer> res = depthFirstSearch(adj);
        // for (Integer x : res) {
        // System.out.print(x + " ");
        // }

        System.out.println(res.size());
    }
}
