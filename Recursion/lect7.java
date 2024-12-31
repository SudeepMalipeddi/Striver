package Recursion;

import java.util.*;

public class lect7 {
    public static void subsequence(int[] arr, int ind, int k, ArrayList<Integer> path) {
        if (ind == arr.length) {
            int sum = 0;
            for (int x : path) {
                sum += x;
            }
            if (sum == k)
                System.out.println(path);
            return;
        } else {
            subsequence(arr, ind + 1, k, path);
            path.add(arr[ind]);
            subsequence(arr, ind + 1, k, path);
            path.remove(path.size() - 1);
        }
        return;
    }

    public static boolean subsequence1(int[] arr, int ind, int k, int sum, ArrayList<Integer> path) {
        if (ind == arr.length) {
            if (sum == k) {
                System.out.println(path);
                return true;
            } else {
                return false;
            }
        }
        path.add(arr[ind]);
        sum += arr[ind];
        if (subsequence1(arr, ind + 1, k, sum, path) == true) {
            return true;
        }

        path.remove(path.size() - 1);
        sum -= arr[ind];

        if (subsequence1(arr, ind + 1, k, sum, path) == true) {
            return true;
        }
        return false;
    }

    public static int countSubseq(int[] arr, int ind, int sum, int k) {
        if (sum > k) {
            return 0;
        }
        if (ind == arr.length) {
            if (sum == k) {
                return 1;
            } else {
                return 0;
            }
        }

        sum += arr[ind];
        int l = countSubseq(arr, ind + 1, sum, k);
        sum -= arr[ind];
        int r = countSubseq(arr, ind + 1, sum, k);
        return l + r;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 1 };
        int k = 2;
        // Auxiliary space to store each path
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();
        // subsequence1(arr, 0, k, 0, path1);
        subsequence(arr, 0, k, path2);
        // System.out.println(countSubseq(arr, 0, 0, k));

    }
}
