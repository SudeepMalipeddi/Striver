package Graphs;

public class surrounded {

    public void dfs(char[][] board, int i, int j, int[][] vis) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 'X' || vis[i][j] == 1) {
            return;
        }

        vis[i][j] = 1;

        dfs(board, i + 1, j, vis);
        dfs(board, i - 1, j, vis);
        dfs(board, i, j + 1, vis);
        dfs(board, i, j - 1, vis);
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] vis = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == m - 1 || j == 0 || j == n - 1) && board[i][j] == 'O') {
                    dfs(board, i, j, vis);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && vis[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }

    }
}
