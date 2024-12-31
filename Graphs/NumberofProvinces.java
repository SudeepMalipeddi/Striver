package Graphs;

public class NumberofProvinces {

    public void dfs(int i, int[][] arr, boolean[] vis) {
        vis[i] = true;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i][j] == 1 && vis[j] == false) {
                dfs(j, arr, vis);
            }
        }
    }

    public int numberofProvinces(int[][] arr) {
        int n = arr.length;
        boolean[] vis = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                dfs(i, arr, vis);
                res++;
            }
        }
        return res;
    }
}
