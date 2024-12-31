package CodeVita;

import java.util.*;

public class trainArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 2;
        // int ar[] = new int[n];
        // int dep[] = new int[n];

        // for (int i = 0; i < n; i++) {
        // ar[i] = sc.nextInt();
        // int stop = sc.nextInt();
        // dep[i] = ar[i] + stop;
        // }

        int[] ar = { 2, 6 };
        int[] dep = { 6, 8 };
        // Arrays.sort(ar);
        // Arrays.sort(dep);

        // int sol = 0;

        // int ptr1 = 0;
        // int ptr2 = 0;
        // System.err.println("ptr1 is " + ptr1);
        // System.err.println("ptr2 is " + ptr2);

        // while (ptr1 < n && ptr2 < n) {
        // if (dep[ptr2] >= ar[ptr1]) {
        // sol++;
        // ptr2++;
        // }
        // ptr1++;
        // System.err.println("ptr1 is " + ptr1);
        // System.err.println("ptr2 is " + ptr2);
        // }
        // System.out.println(sol);
        solution(ar, dep, n);
        sc.close();
    }

    public static void solution(int[] ar, int[] dep, int n) {
        Arrays.sort(ar);
        Arrays.sort(dep);

        int sol = 0;

        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < n && ptr2 < n) {
            System.out.println("element 1 is " + ar[ptr1]);
            System.out.println("element 2 is " + dep[ptr2]);
            if (dep[ptr2] >= ar[ptr1]) {
                sol++;
                // ptr2++;
                ptr1++;
            } else if (ar[ptr1] > dep[ptr2]) {
                ptr2++;
            }
        }
        System.out.println(sol);
        Arrays.fill()
    }
}
