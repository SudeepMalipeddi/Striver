
package Graphs;

import java.util.*;

public class zeroOne {

    class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] updateMatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] ans = new int[n][m];
        for (int[] a : ans) {
            Arrays.fill(a, -1);
        }

        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {
                    q.add(new Pair(i, j));
                    ans[i][j] = 0;
                }
            }
        }

        int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

        while (q.size() != 0) {
            Pair p = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = p.x + dir[i][0];
                int y = p.y + dir[i][1];

                if (x >= 0 && y >= 0 && x < n && y < m && ans[x][y] == -1) {
                    ans[x][y] = ans[p.x][p.y] + 1;
                    q.add(new Pair(x, y));
                }
            }
        }

        return ans;
    }
}
