package DP;

import java.util.*;

public class lect1 {

    static HashMap<Integer, Integer> mem = new HashMap<>();

    // memoization method
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        // if(mem.get(n) != )
        if (mem.get(n) != null) {
            return mem.get(n);
        }
        mem.put(n, fibo(n - 1) + fibo(n - 2));
        return mem.get(n);
    }

    // tabulation method
    public static int fibo1(int n) {
        if (n <= 1) {
            return n;
        }
        int prev2 = 0, prev = 1;
        int curr = 0;
        for (int i = 2; i <= n; i++) {
            curr = prev2 + prev;
            prev2 = prev;
            prev = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(fibo1(10));
    }
}
