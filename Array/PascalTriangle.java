package Array;

import java.util.*;

public class PascalTriangle {
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0)
            return res;
        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);
        for (int i = 1; i < n; i++) {
            List<Integer> prev = res.get(i - 1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
