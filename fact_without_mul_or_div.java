import java.util.Scanner;

public class fact_without_mul_or_div {
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = multiply(res, i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fact(n));
        }
        sc.close();
    }
}
