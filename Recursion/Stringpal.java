package Recursion;

public class Stringpal {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String a = s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(a);
        System.out.println(isPallindrome(s));
    }

    public static boolean isPallindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.length() < 1) {
            return true;
        }
        return pal(0, s);
    }

    public static boolean pal(int i, String s) {
        if (i >= (s.length() / 2)) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return pal(i + 1, s);
    }
}
