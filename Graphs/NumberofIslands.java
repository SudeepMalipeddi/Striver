
package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {
    class Pair {
        public int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public void bfs(Pair node, char[][] grid, boolean[][] vis) {
        Queue<Pair> queue = new LinkedList<Pair>();

        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        int n = grid.length, m = grid[0].length;
        vis[node.first][node.second] = true;
        queue.add(node);

        while (!queue.isEmpty()) {
            Pair node1 = queue.remove();

            for (int[] d : dir) {
                int row = node1.first + d[0];
                int col = node1.second + d[1];

                if (row >= 0 && row < n && col >= 0 && col < m && grid[row][col] == '1' && !vis[row][col]) {
                    vis[row][col] = true;
                    queue.add(new Pair(row, col));
                }
            }
        }
    }

    // bfs way
    // public int numIslands(char[][] grid) {
    // int m = grid.length;
    // int n = grid[0].length;

    // boolean[][] visited = new boolean[m][n];
    // int count = 0;

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if (!visited[i][j] && grid[i][j] == '1') {
    // Pair node = new Pair(i, j);
    // bfs(node, grid, visited);
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // dfs way
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    dfs(i, j, grid, vis);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j, char[][] grid, boolean[][] vis) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || vis[i][j] || grid[i][j] == '0'
                || grid[i][j] == '2') {
            return;
        }
        grid[i][j] = '2';
        vis[i][j] = true;

        dfs(i + 1, j, grid, vis);
        dfs(i - 1, j, grid, vis);
        dfs(i, j + 1, grid, vis);
        dfs(i, j - 1, grid, vis);
    }
}
