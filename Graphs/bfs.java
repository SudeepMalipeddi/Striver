package Graphs;

import java.util.*;

public class bfs {
    public ArrayList<Integer> breadthFirstSearch(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();

        boolean[] vis = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            Integer curr = q.poll();
            res.add(curr);

            for (Integer x : adj.get(curr)) {
                if (vis[x] == false) {
                    q.offer(x);
                    vis[x] = true;
                }
            }
        }
        return res;
    }

    // public void bfs(int i, int j, )

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes");

        int n = sc.nextInt();
        int t = n;
        while (t-- > 0) {
            System.out.println("Enter the number of edges");
            int m = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            System.out.println("Enter the edges");
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            bfs b = new bfs();
            ArrayList<Integer> res = b.breadthFirstSearch(adj);
            System.out.println(res);
        }
        sc.close();
    }
}
