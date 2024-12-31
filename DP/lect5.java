package DP;

// Maximum sum of non-adjacent elements
public class lect5 {
    public static int max(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        if (n == 1) {
            return dp[0];
        }
        dp[1] = Math.max(nums[0], nums[1]);
        if (n == 2) {
            return dp[1];
        }
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }

    public static int rec(int[] nums, int ind, int[] dp) {
        if (ind < 0) {
            return 0;
        }
        if (ind == 0) {
            return nums[0];
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int pick = nums[ind] + rec(nums, ind - 2, dp);
        int notPick = rec(nums, ind - 1, dp);

        return dp[ind] = Math.max(pick, notPick);
    }
}
