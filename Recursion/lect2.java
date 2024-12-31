package Recursion;

// import java.util.*;

public class lect2 {
    public static void printName(String name, int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(name);
        printName(name, i + 1, n);
    }

    public static void printNumbers(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        printNumbers(i + 1, n);
    }

    public static void printNumbersRev(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbersRev(n - 1);
    }

    public static void backtrackPrintNumbers(int i, int n) {
        if (i == 0) {
            return;
        }
        backtrackPrintNumbers(i - 1, n);
        System.out.println(i);
    }

    public static void backtrackPrintRevNumbers(int i, int n) {
        if (i > n) {
            return;
        }
        backtrackPrintRevNumbers(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        // printName("Wotah", 1, 5);\
        // Scanner sc = new Scanner(System.in);
        // printNumbers(1, 10);
        // printNumbersRev(sc.nextInt());
        // backtrackPrintNumbers(10, 10);
        // backtrackPrintRevNumbers(1, 10);
    }
}
