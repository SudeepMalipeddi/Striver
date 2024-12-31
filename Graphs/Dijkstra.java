package Graphs;

import java.util.*;

class iPair {
    int first, second;

    iPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Dijkstra {
    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {

        int V = adj.size();
        int[] dist = new int[V];
        PriorityQueue<iPair> pq = new PriorityQueue<>((a, b) -> a.first - b.first);

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[src] = 0;
        pq.add(new iPair(0, src));

        while (!pq.isEmpty()) {
            int dis = pq.peek().first;
            int u = pq.peek().second;
            pq.poll();
            for (iPair neighbour : adj.get(u)) {
                int edgeweight = neighbour.first;
                int adjnode = neighbour.second;

                if (dist[adjnode] > dis + edgeweight) {
                    dist[adjnode] = dis + edgeweight;
                    pq.add(new iPair(dist[adjnode], adjnode));
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            ans.add(dist[i]);
        }
        return ans;
    }
}
