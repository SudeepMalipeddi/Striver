package Recursion;

import java.util.*;

public class lect8 {
    public static List<List<Integer>> combinationSumI(int[] arr, int k) {
        List<List<Integer>> res = new ArrayList<>();

        // dfs(arr, k, 0, new ArrayList<>(), 0, res);
        dfs2(arr, k, 0, new ArrayList<>(), 0, res);
        return res;

    }

    public static void dfs(int arr[], int target, int ind, List<Integer> comb, int total, List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(comb));
            return;
        }
        if (total > target || ind >= arr.length) {
            return;
        }
        comb.add(arr[ind]);
        dfs(arr, target, ind, comb, total + arr[ind], res);
        comb.remove(comb.size() - 1);
        dfs(arr, target, ind + 1, comb, total, res);
    }

    public static void dfs2(int arr[], int target, int ind, List<Integer> comb, int val, List<List<Integer>> res) {
        if (ind == arr.length) {
            if (target == 0) {
                res.add(new ArrayList<>(comb));
            }
            return;
        }

        if (arr[ind] <= target) {
            comb.add(arr[ind]);
            dfs2(arr, target - arr[ind], ind, comb, val, res);
            comb.remove(comb.size() - 1);
        }
        dfs2(arr, target, ind + 1, comb, val, res);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        int k = 8;
        System.out.println(combinationSumI(arr, k));
    }
}
