package Graphs;

public class floodfill {

    public void dfs(int i, int j, int[][] image, int[][] copy, int srcolor, int color) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || copy[i][j] != srcolor) {
            return;
        }

        copy[i][j] = color;
        dfs(i + 1, j, image, copy, srcolor, color);
        dfs(i - 1, j, image, copy, srcolor, color);
        dfs(i, j + 1, image, copy, srcolor, color);
        dfs(i, j - 1, image, copy, srcolor, color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int srcolor = image[sr][sc];

        if (srcolor == color) {
            return image;
        }

        int[][] copy = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = image[i][j];
            }
        }

        dfs(sr, sc, image, copy, srcolor, color);

        return copy;
    }
}
