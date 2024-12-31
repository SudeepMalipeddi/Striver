package Recursion;

import java.util.*;;

public class lect6 {
    public static void printSubseq(int ind, int[] arr, ArrayList<Integer> path) {
        if (ind == arr.length) {
            if (path.size() > 0)
                System.out.println(path);
            return;
        } else {
            printSubseq(ind + 1, arr, path);
            path.add(arr[ind]);
            printSubseq(ind + 1, arr, path);
            path.remove(path.size() - 1);
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        // Auxiliary space to store each path
        ArrayList<Integer> path = new ArrayList<>();

        printSubseq(0, arr, path);
    }
}
