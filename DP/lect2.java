package DP;

import java.util.*;

public class lect2 {

    public static int climbStairs(int ind) {
        HashMap<Integer, Integer> mem = new HashMap<>();
        return climbStairs(mem, ind);
    }

    public static int climbStairs(HashMap<Integer, Integer> mem, int ind) {
        if (ind <= 0)
            return 1;

        if (mem.containsKey(ind))
            return mem.get(ind);
        mem.put(ind, climbStairs(mem, ind - 1) + climbStairs(mem, ind - 2));

        return mem.get(ind);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2 - 1));
    }
}
