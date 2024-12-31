package Recursion;

import java.util.*;

public class combSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        combsum(candidates, 0, target, new ArrayList<>(), 0, res);
        return res;
    }

    public static void combsum(int[] arr, int ind, int target, List<Integer> comb, int total, List<List<Integer>> res) {

        if (total == target) {
            res.add(new ArrayList<>(comb));
            return;
        }

        if (total > target || ind >= arr.length) {
            return;
        }
        comb.add(arr[ind]);
        combsum(arr, ind, target, comb, total + arr[ind], res);
        comb.remove(comb.size() - 1);
        combsum(arr, ind + 1, target, comb, total, res);
    }
}
