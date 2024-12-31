package Recursion;

public class lect4 {
    public static void reverseArrayTwoPointer(int l, int r, int[] arr) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseArrayTwoPointer(l + 1, r - 1, arr);
    }

    public static void reverseArraySinglePointer(int[] arr, int i) {
        if (i >= (arr.length) / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseArraySinglePointer(arr, i + 1);
    }

    public static boolean checkPallindrome(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return checkPallindrome(s, i + 1);
    }

    public static boolean checkPallindromeTwoP(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return checkPallindromeTwoP(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        // reverseArrayTwoPointer(0, arr.length - 1, arr);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // System.err.println();
        // reverseArraySinglePointer(arr, 0);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        String s = "racecar";
        System.out.println(checkPallindromeTwoP(s, 0, s.length() - 1));
        System.out.println(checkPallindrome(s, 0));
    }
}
