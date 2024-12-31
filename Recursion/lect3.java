package Recursion;

public class lect3 {
    public static void parametrizedsum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        parametrizedsum(i - 1, sum + i);
    }

    public static int funcitionsumfirstn(int n) {
        if (n == 0)
            return 0;
        return n + funcitionsumfirstn(n - 1);
    }

    public static void main(String[] args) {
        // System.out.println(funcitionsumfirstn(3));
        parametrizedsum(3, 0);
    }
}
