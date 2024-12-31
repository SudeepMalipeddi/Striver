import java.util.*;

public class Main1 {

    public static long countPairs(long[] arr) {
        long even = 0, odd = 0;
        for (long x : arr) {
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        long evnsum = (even * (even - 1)) / 2;
        long oddsum = (odd * (odd - 1)) / 2;
        return evnsum + oddsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            // Your code goes here
            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long res = countPairs(arr);

            System.out.println(res);
        }
    }
}
