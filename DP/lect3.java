package DP;

import java.util.Arrays;

public class lect3 {

    public static int minCost(int[] arr, int ind, int[] dp) {
        if (ind == 0) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int left = minCost(arr, ind - 1, dp) + Math.abs(arr[ind] - arr[ind - 1]);
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = minCost(arr, ind - 2, dp) + Math.abs(arr[ind] - arr[ind - 2]);
        }
        return dp[ind] = Math.min(left, right);
    }
    // DP array method

    public static int frogJump(int ind, int[] heights, int[] dp) {
        if (ind == 0) {
            return 0;
        }

        if (dp[ind] != -1) {
            return dp[ind];
        }

        int left = frogJump(ind - 1, heights, dp) + Math.abs(heights[ind] - heights[ind - 1]);
        int right = Integer.MAX_VALUE;
        if (ind > 1)
            right = frogJump(ind - 2, heights, dp) + Math.abs(heights[ind] - heights[ind - 2]);

        return dp[ind] = Math.min(left, right);

    }

    // tabulation method
    public static int tabulation(int n, int[] height, int[] dp) {

        for (int ind = 1; ind < n; ind++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = dp[ind - 1] + Math.abs(height[ind] - height[ind - 1]);
            if (ind > 1)
                jumpTwo = dp[ind - 2] + Math.abs(height[ind] - height[ind - 2]);

            dp[ind] = Math.min(jumpOne, jumpTwo);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        // int[] height = { 30, 10, 60, 10, 60, 50 };
        // int n = height.length;
        // int[] dp = new int[n];
        // Arrays.fill(dp, -1);
        // // System.out.println(frogJump(n - 1, height, dp));
        // dp[0] = 0;
        // System.out.println(tabulation(n - 1, height, dp));

        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(minCost(height, n - 1, dp));
        // int dp[] = new int[n];
        // Arrays.fill(dp, -1);
        // dp[0] = 0;
        // for (int ind = 1; ind < n; ind++) {
        // int jumpTwo = Integer.MAX_VALUE;
        // int jumpOne = dp[ind - 1] + Math.abs(height[ind] - height[ind - 1]);
        // if (ind > 1)
        // jumpTwo = dp[ind - 2] + Math.abs(height[ind] - height[ind - 2]);

        // dp[ind] = Math.min(jumpOne, jumpTwo);
        // }
        // System.out.println(dp[n - 1]);

    }

}
